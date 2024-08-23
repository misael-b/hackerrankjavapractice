package algorithms;

public class LineGraph {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if (x2> x1 && v2>=v1 || x1>x2 && v1>=v2){
            return "NO";
        }

        int numerator = x2-x1;
        int denominator = v1-v2;

        int ratio = numerator % denominator;

        if (ratio == 0){
            return "YES";
        }

        return "NO";



    }
}
