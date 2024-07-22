import java.security.Permission;
import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();

            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

//The following class will prevent you from terminating the code using exit(0)!
}
