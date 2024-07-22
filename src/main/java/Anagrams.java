import java.util.HashMap;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        HashMap<String, Integer> lettersInA = new HashMap<>();
        HashMap<String, Integer> lettersInB = new HashMap<>();
        for(int i = 0; i<a.length(); i++){
            if(!lettersInA.containsKey(a.substring(i,i+1))){
                lettersInA.put(a.substring(i,i+1), 1);
            }else{
                lettersInA.put(a.substring(i,i+1), lettersInA.get(a.substring(i,i+1))+1);
            }
        }

        for(int i = 0; i<b.length(); i++){
            if(!lettersInB.containsKey(b.substring(i,i+1))){
                lettersInB.put(b.substring(i,i+1), 1);
            }else{
                lettersInB.put(b.substring(i,i+1), lettersInB.get(b.substring(i,i+1))+1);
            }
        }
        System.out.println(lettersInA);
        System.out.println(lettersInB);
        return lettersInA.equals(lettersInB);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aaaaa", "aa"));
    }
}
