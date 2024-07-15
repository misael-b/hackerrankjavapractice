import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int terms = scan.nextInt();

        for(int i=0;i<terms;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            for(int j=0;j<n;j++){
                a=a+(int)(Math.pow(2,j)*b);
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    }
