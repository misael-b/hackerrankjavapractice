package algorithms;

import java.io.IOException;

public class TreeHeightCalculator {
    public static int utopianTree(int n) {
        // Write your code here
        int ans = 1;

        for(int i = 0; i<n; i++){
            if(i%2 == 0){
                ans = ans * 2;
            }else{
                ans ++;
            }

        }

        return ans;

    }

    public static void main(String[] args) throws IOException {
        System.out.println(utopianTree(4));
    }


}
