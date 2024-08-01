import java.util.ArrayList;
import java.util.List;

public class SumOfHourGlass {

    public static void main(String[] args){

        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(3);arr1.add(7);arr1.add(-3);arr1.add(0);arr1.add(1);arr1.add(8);
//    3 7 -3 0 1 8
//
//    1 -4 -7 -8 -6 5
//
//    -8 1 3 3 5 7
//
//    -2 4 3 1 2 7
//
//    2 4 -5 1 8 4
//
//    5 -7 6 5 2 8
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(1);arr2.add(-4);arr2.add(-7);arr2.add(-8);arr2.add(-6);arr2.add(5);

        List<Integer> arr3 = new ArrayList<>();
        arr3.add(-8);arr3.add(1);arr3.add(3);arr3.add(3);arr3.add(5);arr3.add(7);

        List<Integer> arr4 = new ArrayList<>();
        arr4.add(-2);arr4.add(4);arr4.add(3);arr4.add(1);arr4.add(2);arr4.add(7);

        List<Integer> arr5 = new ArrayList<>();
        arr5.add(2);arr5.add(4);arr5.add(-5);arr5.add(1);arr5.add(8);arr5.add(4);

        List<Integer> arr6 = new ArrayList<>();
        arr6.add(5);arr6.add(-7);arr6.add(6);arr6.add(5);arr6.add(2);arr6.add(8);

        arr.add(arr1);arr.add(arr2);arr.add(arr3);arr.add(arr4);arr.add(arr5);arr.add(arr6);

        int total = Integer.MIN_VALUE;;
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=4; j++){
                int center = arr.get(i).get(j);
                int sumOfRowBefore = arr.get(i-1).get(j-1) + arr.get(i-1).get(j) +arr.get(i-1).get(j+1);
                int sumOfRowAfter = arr.get(i+1).get(j-1) + arr.get(i+1).get(j) +arr.get(i+1).get(j+1);
                int sumOfAll = center + sumOfRowAfter + sumOfRowBefore;
                if(sumOfAll > total){
                    total = sumOfAll;
                }
            }
        }

        System.out.println(total);
    }
}
