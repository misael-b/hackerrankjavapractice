package algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindingScoreboardPosition {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> ranking = new ArrayList<>();

        int currentRank = 1;
        ranking.add(1);
        for (int i = 1; i<ranked.size(); i++){
            if(ranked.get(i) < ranked.get(i-1)){
                currentRank += 1;
                ranking.add(currentRank);
            }else{
                ranking.add(currentRank);
            }
        }

        List<Integer> finalStanding = new ArrayList<>();

        for(int score : player){
            for(int i = 0; i<ranked.size(); i++){
                if(ranked.get(i) <= score){
                    int rank = ranking.get(i);
                    finalStanding.add(rank);
                    break;
                }
                if(i == ranked.size()-1){
                    finalStanding.add(ranking.get(i) +1);
                }

            }
        }
        return finalStanding;

    }

    public static void main(String[] args) throws IOException {
        List<Integer> rankingScores = Arrays.asList(100, 90, 90, 80, 75, 60);
        List<Integer> playerScores = Arrays.asList(50,65, 77, 90, 102);

        System.out.println(climbingLeaderboard(rankingScores, playerScores));;
    }
}
