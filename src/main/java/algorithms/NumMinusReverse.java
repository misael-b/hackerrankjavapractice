package algorithms;

import java.io.*;

public class NumMinusReverse {
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int numOfDays = 0;
        for (Integer num = i; num <= j; num++) {
            String reverseString = num.toString();
            String reverseStringNum = "";
            for (int s = reverseString.length(); s > 0; s--) {
                reverseStringNum += reverseString.charAt(s - 1);
            }
            int reverseInt = Integer.valueOf(reverseStringNum);
            if (((float) num - reverseInt) % k == 0) {
                numOfDays++;
            }
        }
        return numOfDays;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
