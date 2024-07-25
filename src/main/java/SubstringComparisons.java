public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
//        for(int i = 0; i<s.length()-k; i++){
//            if (s.charAt(i) > largest.charAt(0)){
//                if(s.charAt(i) == largest.charAt(0)){
//                    for(int j = 1; j<k; j++){
//                        if(s.charAt(i+j) !=largest.charAt(i+j) && (s.charAt(i+j)>largest.charAt(i+j))){
//                            largest = s.substring(i, i+k);
//                        }
//                    }
//                }else{
//                    largest = s.substring(i, i+k);
//                }
//
//            }
//            if (s.charAt(i) < smallest.charAt(0)){
//                if(s.charAt(i) == smallest.charAt(0)){
//                    for(int j = 1; j<k; j++){
//                        if(s.charAt(i+j) != smallest.charAt(i+j) && (s.charAt(i+j)<smallest.charAt(i+j))){
//                            smallest = s.substring(i, i+k);
//                        }
//                    }
//                }else{
//                    smallest = s.substring(i, i+k);
//                }
//            }
//        }
            for(int i=0; i<s.length()-k+1; i++){
                String sub = s.substring(i,i+k);
                if(sub.compareTo(largest)>0){
                    largest = sub;
                }
                if(sub.compareTo(smallest)<0){
                    smallest = sub;
                }
            }

        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs", 30));
    }
}
