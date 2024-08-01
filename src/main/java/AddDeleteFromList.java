import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AddDeleteFromList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            list.add(i, sc.nextInt());
        }

        int query = sc.nextInt();
        for(int i = 0; i < query; i++){
            String operation = sc.next();
            if(operation.equals("Insert")){
                int index = sc.nextInt();
                int number = sc.nextInt();
                list.add(index, number);
            } else if(operation.equals("Delete")){
                int number = sc.nextInt();
                list.remove(number);
            }

        }
        String listAsString = "";
        for(int i =0; i<list.size(); i++){
            listAsString += list.get(i) + " ";
        }
        System.out.println(listAsString.trim());
        }
}
