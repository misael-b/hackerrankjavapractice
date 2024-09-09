package algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PairCounter {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int number : ar){
            if (!counter.containsKey(number)){
                counter.put(number, 1);
            }else{
                counter.put(number, counter.get(number)+1);
            }
        }
        int total = 0;
        for(int value : counter.values()){
            if(value > 1){
                if(value %2 != 0){
                    value -= 1;
                }
                total += value;
            }

        }
        System.out.println(counter);


        return (total/2) ;

    }

    public static void main(String[] args) throws IOException {
        List<Integer> ar = new ArrayList<>();
        // 6 5 2 3 5 2 2 1 1 5 1 3 3 3 5
        ar.add(6);
        ar.add(5);
        ar.add(2);
        ar.add(3);
        ar.add(5);
        ar.add(2);
        ar.add(2);
        ar.add(1);
        ar.add(1);
        ar.add(5);
        ar.add(1);
        ar.add(3);
        ar.add(3);
        ar.add(3);
        ar.add(5);


        System.out.println(sockMerchant(15, ar));
    }

}
