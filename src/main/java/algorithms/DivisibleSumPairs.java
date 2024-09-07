package algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int numOfPairs = 0;

        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sum = ar.get(i) + ar.get(j);
                if(sum % k ==0){
                    numOfPairs++;
                }
            }
        }
        return numOfPairs;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }


}
