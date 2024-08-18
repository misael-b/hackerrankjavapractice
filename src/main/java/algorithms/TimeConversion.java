package algorithms;

import java.io.*;

public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String units = s.substring(8);
        String time = s.substring(0, 8);
        String hour = s.substring(0, 2);

        if(units.equals("AM") && !hour.equals("12")){
            return time;
        }else if (units.equals("PM") && !hour.equals("12")){
            int newHour = Integer.parseInt(hour);
            int fixedHour = newHour +12;
            return fixedHour + time.substring(2);
        }else if(units.equals("AM")){
            return "00" + time.substring(2);
        }else{
            return time;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
