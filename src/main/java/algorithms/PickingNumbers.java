package algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<Integer> uniqueNumbers = new ArrayList<>();

        for(int num : a){
            if(!uniqueNumbers.contains(num)){
                uniqueNumbers.add(num);
            }
        }

        if(uniqueNumbers.size() == 1){
            return a.size() -1;
        }



        int result = 0;
        for(int uniNumber : uniqueNumbers){
            int occurances = 0;
            occurances += getOccurrences(a, uniNumber);

            int numBelow = getOccurrences(a, uniNumber -1);
            int numAbove = getOccurrences(a, uniNumber +1);
            if(numAbove > numBelow){
                occurances += getOccurrences(a, uniNumber +1);
            }else{
                occurances += getOccurrences(a, uniNumber -1);
            }


            if(occurances > result){
                result = occurances;
            }

        }
        System.out.println(result);
        return result;


    }

    public static int getOccurrences(List<Integer> numbers, int number)
    {
        int count = 0;

        for (Integer integer : numbers) {

            if (number == integer) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> anotherList = Arrays.asList(4,97,5,97,97,4,97,4,97,97,97 ,97, 4, 4, 5, 5, 97, 5, 97, 99, 4, 97, 5, 97, 97, 97, 5, 5, 97, 4, 5, 97, 97, 5, 97, 4, 97, 5, 4, 4, 97, 5, 5, 5, 4, 97, 97, 4 ,97, 5, 4, 4, 97, 97, 97, 5 ,5, 97, 4, 97, 97, 5 ,4 ,97 ,97, 4, 97, 97, 97, 5 ,4 ,4, 97, 4, 4, 97, 5, 97, 97, 97, 97, 4 ,97, 5, 97, 5, 4, 97, 4 ,5, 97, 97, 5, 97 ,5 ,97, 5, 97, 97, 97);

//        System.out.println(arrayList.size());
        System.out.println(pickingNumbers(anotherList));
        System.out.println(getOccurrences(anotherList, 97));


    }

}
