import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class Currency {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        NumberFormat USFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat IndiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat ChinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat FranceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + USFormat.format(num));
        System.out.println("India: "+ IndiaFormat.format(num));
        System.out.println("China: " + ChinaFormat.format(num));
        System.out.println("France: " + FranceFormat.format(num));
    }
}
