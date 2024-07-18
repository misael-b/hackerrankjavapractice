import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = null;
        for(int i= 0; i<n; i++){
            try{
                input = sc.next();
                long value = Long.parseLong(input);
                System.out.println( input+ " can be fitted in:");
                if(value>= -128 && value<= 127){
                    System.out.println("* byte");
                }
                if(value>= -32768 && value<= 32767){
                    System.out.println("* short");
                }
                if(value>= -Integer.MIN_VALUE && value<= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(value >= Long.MIN_VALUE && value <= Long.MAX_VALUE){
                    System.out.println("* long");
                }

            } catch(Exception e){
                System.out.println(input + " can't be fitted anywhere.");

            }
        }
    }

}
