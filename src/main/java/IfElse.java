import java.io.IOException;

public class IfElse {
    public static void main(String[] args) throws IOException {
        int N = 18;

        if(N%2 != 0){
            System.out.println("Weird");
        } else{
            if(N>=2 && N<=5){
                System.out.println("Not Weird");
            } else if (N>=6 && N<=20) {
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
        }}


    }
}
