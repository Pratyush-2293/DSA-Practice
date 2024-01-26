import java.util.*;

public class CapitalizeFirstLetters {
    public static void main(String args[]){
        String str = "hello i am pratyush";
        Capitalize(str);
    }

    public static void Capitalize(String str){  // a different solution, with same time complexity, but looks cleaner. Intuitive coz its like flags in Unity.
        StringBuilder newString = new StringBuilder("");
        boolean capNext = true;

        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            if(capNext==true){
                newString.append(Character.toUpperCase(curr));
                capNext = false;
            }
            else if(curr == ' '){
                newString.append(" ");
                capNext = true;
            }
            else{
                newString.append(curr);
            }
        }

        System.out.println(newString);
    }
}
