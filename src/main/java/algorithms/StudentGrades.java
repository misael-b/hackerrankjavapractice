package algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentGrades {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> roundedGrades = new ArrayList<>();
        for(Integer grade : grades){
            if(grade < 38){
                roundedGrades.add(grade);
            } else{
                if(grade %10 == 3 || grade %10 == 4 ||
                        grade %10 == 8|| grade %10 == 9 ){
                    int num = grade /5;
                    num += 1;
                    roundedGrades.add(num*5);
                }else{
                    roundedGrades.add(grade);
                }
            }
        }

        return roundedGrades;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
