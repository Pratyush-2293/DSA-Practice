import java.util.*;

public class Q4_Strings_Anagrams {
    public static void main(String args[]){
        String str1 = "race";
        String str2 = "carens";

        System.out.println("Are the arrays anagrams? ");
        System.out.println(IsAnagram(str1,str2));
    }

    public static boolean IsAnagram(String str1, String str2){
        if(str1.length()==str2.length()){
            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            return Arrays.equals(str1Array, str2Array);
        }
        else{
            return false;
        }
    }
}
