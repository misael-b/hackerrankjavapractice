package algorithms;

import java.io.IOException;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleyCounter = 0;
        int elevation = 0;

        for(int i = 0; i<steps; i++){
            Character step = path.charAt(i);
            // System.out.println(step);
            if (step.equals('U')){
                elevation += 1;
            }else{
                elevation -= 1;
            }

            if(elevation == 0){
                if(path.charAt(i) == 'U'){
                    valleyCounter ++;
                }
            }

        }

        return valleyCounter;

    }

    public static void main(String[] args) throws IOException {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }
}
