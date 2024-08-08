package algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        for(int i = 0; i<a.size(); i++){
            if(a.get(i)> b.get(i)){
                results.set(0, results.get(0) +1);
            }else if(a.get(i)< b.get(i)){
                results.set(1, results.get(1) +1);
            }
        }
        return results;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

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
