import java.util.*;

public class PalindromeCheck {
    public static void main(String args[]){
        String str = "racecar";

        System.out.println("Is string palindrome? ");
        System.out.println(CheckPalindrome(str));
    }

    public static boolean CheckPalindrome(String str){
        int n = str.length();

        for(int i = 0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }

        return true;
    }
}
