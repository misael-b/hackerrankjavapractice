package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int numOfPositives = 0;
        int numOfNegatives = 0;
        int numOfZeros = 0;

        for(int num : arr){
            if(num > 0){
                numOfPositives += 1;
            }else if (num == 0){
                numOfZeros += 1;
            }else{
                numOfNegatives +=1;
            }
        }
        System.out.println((float)numOfPositives/arr.size());
        System.out.println((float)numOfNegatives/arr.size());
        System.out.println((float)numOfZeros/arr.size());

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        plusMinus(arr);

        bufferedReader.close();
    }
}
