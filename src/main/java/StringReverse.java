public class StringReverse {

    public static void main(String[] args) {

        String A = "madam";
        /* Enter your code here. Print output to STDOUT. */
        String newString = "";
        for(int i =A.length(); i>0; i--){
            newString += A.substring(i-1,i);
        }
        System.out.println(newString);
        if(newString.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }

}
