package algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubArrayCounter {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int result = 0;

        for(int i = 0; i<s.size()-m+1; i++){
            int sum = 0;
            for(int j = 0; j<m; j++){
                sum+= s.get(i+j);
            }
            if(sum == d){
                result ++;
            }
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
//         4 1 3 3 4 2 1
        List<Integer> s = new ArrayList<>();
        s.add(4);

        System.out.println(birthday(s,4,1));

    }
}
