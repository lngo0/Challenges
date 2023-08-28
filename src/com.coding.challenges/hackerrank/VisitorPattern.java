package com.coding.challenges.hackerrank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    int res = 0;
    public int getResult() {
        return res;
    }

    public void visitNode(TreeNode node) {
        //empty
    }

    public void visitLeaf(TreeLeaf leaf) {
        res += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    final int M = 1000000000 + 7;
    long res = 1;
    public int getResult() {
        return (int) res;
    }

    public void visitNode(TreeNode node) {
        //implement this
        if (node.getColor().equals(Color.RED))
        {
            res = (res * node.getValue()) % M;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor().equals(Color.RED))
        {
            res = (res * leaf.getValue()) % M;
        }
    }
}

class FancyVisitor extends TreeVis {
    int even_sum = 0;
    int green_sum = 0;
    public int getResult() {
        return Math.abs(even_sum - green_sum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0)
        {
            even_sum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor().equals(Color.GREEN))
        {
            green_sum += leaf.getValue();
        }
    }
}

public class VisitorPattern {
    private static int [] values;
    private static Color [] colors;
    private static HashMap<Integer, HashSet<Integer>> map;

    public static Tree solve() {
        Scanner scan = new Scanner(System.in);
        int numNodes = scan.nextInt();

        values = new int[numNodes];
        colors = new Color[numNodes];
        map = new HashMap<>(numNodes);
        for (int i = 0; i < numNodes; i++) {
            values[i] = scan.nextInt();
        }
        for (int i = 0; i < numNodes; i++) {
            colors[i] = scan.nextInt() == 0 ? Color.RED : Color.GREEN;
        }

        for (int i = 0; i < numNodes - 1; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();

            //Edges are undirected: Add 1st direction
            HashSet<Integer> uNeighbors = map.computeIfAbsent(u, k -> new HashSet<>());
            uNeighbors.add(v);

            //Edges are undirected: Add 2nd direction
            HashSet<Integer> vNeighbors = map.computeIfAbsent(v, k -> new HashSet<>());
            vNeighbors.add(u);
        }
        scan.close();

        // Handle 1-node tree
        if (numNodes == 1) {
            return new TreeLeaf(values[0], colors[0], 0);
        }

        // Create Tree
        TreeNode root = new TreeNode(values[0], colors[0], 0);
        addChildren(root, 1);
        return root;
    }

    // Recursively adds children of a TreeNode
    private static void addChildren(TreeNode parent, Integer parentNum) {
        // Get HashSet of children and loop through them
        for (Integer treeNum : map.get(parentNum)) {
            // Remove the opposite arrow direction
            map.get(treeNum).remove(parentNum);

            // Add child
            HashSet<Integer> grandChildren = map.get(treeNum);
            boolean childHasChild = (grandChildren != null && !grandChildren.isEmpty());
            Tree tree;
            if (childHasChild) {
                tree = new TreeNode(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
            } else {
                tree = new TreeLeaf(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
            }
            parent.addChild(tree);

            //Recurse if necessary
            if (tree instanceof TreeNode) {
                addChildren((TreeNode) tree, treeNum);
            }
        }
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
