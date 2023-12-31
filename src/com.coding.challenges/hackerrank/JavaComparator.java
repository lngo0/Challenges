package com.coding.challenges.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparator {
    static class Checker implements Comparator<Player> {
        @Override
        public int compare(Player p1, Player p2) {
            if (p1.score == p2.score) {
                return p1.name.compareTo(p2.name);
            }
            return p2.score - p1.score;
        }
    }

    static class Player {
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }
    }
    /*
        5
        amy 100
        david 100
        heraldo 50
        aakansha 75
        aleksa 150
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
