package algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddingDiagonals {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int size = arr.get(0).size();

        int totalDiagonal1 = 0;
        int totalDiagonal2 = 0;

        for (int i= 0; i<size; i++){
            totalDiagonal1 += arr.get(i).get(i);
            totalDiagonal2 += arr.get(i).get(size - i-1);
        }


        return Math.abs(totalDiagonal1 - totalDiagonal2);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
