import java.util.*;

public class LargestString {
    public static void main(String args[]){
        String fruits[] = {"apple", "banana", "mango"};

        System.out.println("Largest string is: "+FindLargestString(fruits));
    }


    public static String FindLargestString(String str[]){
        String largest = str[0];

        for(int i=0;i< str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest = str[i];
            }
        }

        return largest;
    }
}


