public class FindSubsets_Backtracking {
    public static void main(String args[]){
        FindSubsets("abc", "", 0);
    }

    public static void FindSubsets(String str, String ans, int i){
        // base case
        if(i==str.length()){
            if(ans.isEmpty()){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }

            return;
        }

        //recursion
        // if adding char:
        FindSubsets(str, ans+str.charAt(i), i+1);
        // if not adding char:
        FindSubsets(str,ans, i+1);
    }
}

// Note: The number of possible subsets of a string = 2^n
// Where, n is the length of the string.
// This number also includes an empty string as a subset.