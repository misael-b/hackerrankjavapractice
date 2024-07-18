import java.util.Scanner;

public class PageCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while(sc.hasNext()){
            String line = sc.nextLine();
            counter ++;
            System.out.println(counter + " " + line);
        }


    }
}
