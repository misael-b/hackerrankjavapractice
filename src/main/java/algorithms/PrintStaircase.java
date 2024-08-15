package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStaircase {

    public static void staircase(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            int numOfSpaces = n - i;
            String line = "";
            String spaces = "";
            for (int j = 0; j < numOfSpaces; j++) {
                spaces += " ";
            }
            line += spaces;
            for (int k = 0; k < i; k++) {
                line += "#";
            }
            System.out.println(line);

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        staircase(n);

        bufferedReader.close();
    }
}
