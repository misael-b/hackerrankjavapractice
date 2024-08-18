package algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NumOfCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = 0;
        int numOfCandles = 0;
        for(int num: candles){
            if (num>max){
                max = num;
                numOfCandles = 1;
            }else if(num == max){
                numOfCandles++;
            }
        }

        return numOfCandles;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < candlesCount; i++) {
            int candlesItem = Integer.parseInt(candlesTemp[i]);
            candles.add(candlesItem);
        }

        int result = birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
