package algorithms;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FindingAreaOfHighlightedWord {
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int maxHeight = -1;
        for (int i = 0; i<word.length(); i++){
            String letter = word.substring(i, i+1);
            int index = getNumberFromLetter(letter);
            int height = h.get(index);
            if(height > maxHeight){
                maxHeight = height;
            }
        }

        return word.length()*maxHeight;

    }

    public static int getNumberFromLetter(String letter){

        return switch (letter) {
            case "a" -> 0;
            case "b" -> 1;
            case "c" -> 2;
            case "d" -> 3;
            case "e" -> 4;
            case "f" -> 5;
            case "g" -> 6;
            case "h" -> 7;
            case "i" -> 8;
            case "j" -> 9;
            case "k" -> 10;
            case "l" -> 11;
            case "m" -> 12;
            case "n" -> 13;
            case "o" -> 14;
            case "p" -> 15;
            case "q" -> 16;
            case "r" -> 17;
            case "s" -> 18;
            case "t" -> 19;
            case "u" -> 20;
            case "v" -> 21;
            case "w" -> 22;
            case "x" -> 23;
            case "y" -> 24;
            case "z" -> 25;
            default -> -1;
        };
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String word = bufferedReader.readLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
