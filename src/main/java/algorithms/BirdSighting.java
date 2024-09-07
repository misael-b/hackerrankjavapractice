package algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirdSighting {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int numOf1 = 0;
        int numOf2 = 0;
        int numOf3 = 0;
        int numOf4 = 0;
        int numOf5 = 0;

        for(int number : arr){
            if (number == 1){
                numOf1 ++;
            } else if(number == 2){
                numOf2 ++;
            } else if(number == 3){
                numOf3 ++;
            }else if (number == 4){
                numOf4++;
            }else{
                numOf5 ++;
            }

        }

        List<Integer> integersArray = new ArrayList<>();
        integersArray.add(numOf1);
        integersArray.add(numOf2);
        integersArray.add(numOf3);
        integersArray.add(numOf4);
        integersArray.add(numOf5);
        Collections.sort(integersArray);
        int maxNum = integersArray.get(4);

        if(numOf1 == maxNum){
            return 1;
        }else if(numOf2 == maxNum){
            return 2;
        }else if(numOf3 == maxNum){
            return 3;
        }else if(numOf4 == maxNum){
            return 4;
        }else{
            return 5;
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
