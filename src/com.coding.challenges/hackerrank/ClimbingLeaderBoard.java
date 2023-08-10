package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClimbingLeaderBoard {
    /*

     */
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        ArrayList<Integer> leaderboard = (ArrayList<Integer>) ranked;
        ArrayList<Integer> playerScores = (ArrayList<Integer>) player;
        ArrayList<Integer> ranks = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (Integer integer : leaderboard) {
            if (!map.containsKey(integer)) {
                map.put(integer, rank++);
            }
        }
        int initial = leaderboard.size() - 1;
        for (int score : playerScores) {
            for (int i = initial; i >= 0; i--) {
                if (score >= leaderboard.get(i)) {
                    rank = map.get(leaderboard.get(i));
                    initial = i - 1;
                } else
                    break;
            }
            ranks.add(rank);
        }
        return ranks;
    }
}
