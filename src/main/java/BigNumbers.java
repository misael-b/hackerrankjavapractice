import java.math.BigInteger;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger bigNum1 = sc.nextBigInteger();
        BigInteger bigNum2 = sc.nextBigInteger();
        System.out.println(bigNum1.add(bigNum2));;
        System.out.println(bigNum1.multiply(bigNum2));

    }
}
