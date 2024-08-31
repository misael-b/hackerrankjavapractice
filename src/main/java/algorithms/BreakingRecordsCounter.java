package algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BreakingRecordsCounter {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int minScore =scores.get(0);
        int maxScore = scores.get(0);

        int minScoreBreak = 0;
        int maxScoreBreak = 0;

        for(int i = 1; i<scores.size(); i++){
            if(scores.get(i)>maxScore){
                maxScore = scores.get(i);
                maxScoreBreak ++;
            }
            if(scores.get(i) < minScore){
                minScore = scores.get(i);
                minScoreBreak ++;
            }
        }
        List<Integer> results = new ArrayList<>();
        results.add(maxScoreBreak);
        results.add(minScoreBreak);

        return results;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }

        List<Integer> result = breakingRecords(scores);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
