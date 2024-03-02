public class FindPermutations_Backtracking {
    public static void main(String args[]){
        FindPermutations("abc", "");
    }

    public static void FindPermutations(String str, String ans){
        // Base Case
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        // Recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            // eg. "abcde" = "ab" + "de" = "abde"
            String newStr = str.substring(0,i) + str.substring(i+1);
            FindPermutations(newStr, ans+curr);
        }
    }
}

// Note: The number of possible permutations of a string of length n = n! (factorial)