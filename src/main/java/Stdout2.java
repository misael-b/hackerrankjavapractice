import java.util.Scanner;

public class Stdout2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        scanner.nextLine();
        String myString = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }
}
