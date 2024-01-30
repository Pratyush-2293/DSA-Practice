import java.util.*;

public class Q1_Strings_VowelCount {
    public static void main(String args[]){
        String str = "Hello I am Pratyush.";

        System.out.println("The number of lowercase vowels are: "+CountVowels(str));
    }

    public static int CountVowels(String str){
        int count = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }

        return count;
    }
}
