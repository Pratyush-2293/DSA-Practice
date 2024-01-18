import java.util.*;

public class FunctionMethods_Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        IsPalindrome(sc.nextInt());

    }

    public static void IsPalindrome(int num){
        int numArchive = num;
        int compareNum = 0;
        while(num>0){
            int lastDigit = num%10;
            compareNum = compareNum*10 + lastDigit;
            num = num/10;
        }
        System.out.println(compareNum);

        if(compareNum == numArchive){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }   
}
