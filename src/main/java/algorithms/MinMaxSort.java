package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MinMaxSort {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int i = 0; i<arr.size(); i++){
            long sum = 0;
            for(int j= 0; j<arr.size(); j++){
                if(j!= i){
                    sum += arr.get(j);
                }
            }
            if(sum>max){
                max = sum;
            }
            if(sum<min){
                min = sum;
            }
        }

        System.out.println(min + " " + max);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

       miniMaxSum(arr);

        bufferedReader.close();
    }
}
