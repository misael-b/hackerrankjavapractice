import java.util.Scanner;

public class Stdout1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Integer myInt = scanner.nextInt();
        Integer myInt2 = scanner.nextInt();
        Integer myInt3 = scanner.nextInt();
        scanner.close();
        System.out.println(myInt);
        System.out.println(myInt2);
        System.out.println(myInt3);
    }
}
