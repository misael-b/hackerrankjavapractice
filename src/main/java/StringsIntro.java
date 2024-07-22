import java.util.HashMap;
import java.util.Scanner;

public class StringsIntro {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lengthOfA = A.length();
        int lengthOfB = B.length();
        System.out.println(lengthOfA + lengthOfB);
        System.out.println(compare(A, B));
        String firstLetterA = A.toUpperCase().substring(0,1);
        String firstLetterB = B.toUpperCase().substring(0,1);
        System.out.println(firstLetterA + A.substring(1) +" "+ firstLetterB + B.substring(1));





    }
    public static String compare(String A, String B){
        HashMap<String, Integer> alphabet = new HashMap<>();
        alphabet.put("a", 1);
        alphabet.put("b", 2);
        alphabet.put("c", 3);
        alphabet.put("d", 4);
        alphabet.put("e", 5);
        alphabet.put("f", 6);
        alphabet.put("g", 7);
        alphabet.put("h", 8);
        alphabet.put("i", 9);
        alphabet.put("j", 10);
        alphabet.put("k", 11);
        alphabet.put("l", 12);
        alphabet.put("m", 13);
        alphabet.put("n", 14);
        alphabet.put("o", 15);
        alphabet.put("p", 16);
        alphabet.put("q", 17);
        alphabet.put("r", 18);
        alphabet.put("s", 19);
        alphabet.put("t", 20);
        alphabet.put("u", 21);
        alphabet.put("v", 22);
        alphabet.put("w", 23);
        alphabet.put("x", 24);
        alphabet.put("y", 25);
        alphabet.put("z", 26);
        String firstLetterA = A.toLowerCase().substring(0,1);
        String firstLetterB = B.toLowerCase().substring(0,1);
        Integer numA = alphabet.get(firstLetterA);
        Integer numB = alphabet.get(firstLetterB);
        if(numA<numB){
            return "No";
        }
        if(numA == numB){
            return "No";
        }
        return "Yes";



    }

}
