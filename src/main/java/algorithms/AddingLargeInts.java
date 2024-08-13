package algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddingLargeInts {

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long total = 0;
        for(long num: ar){
            total+= num;
        }
        return total;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arTemp[i]);
            ar.add(arItem);
        }

        long result = aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
