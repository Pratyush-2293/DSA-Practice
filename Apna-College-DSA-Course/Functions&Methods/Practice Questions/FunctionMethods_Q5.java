import java.util.*;

public class FunctionMethods_Q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        SumDigits(sc.nextInt());
    }

    public static void SumDigits(int num){
        int sum = 0;
        while(num>0){
            int lastDigit = num%10;
            sum+=lastDigit;
            num = num/10;
        }

        System.out.println("Sum of digits is: "+sum);
    }
}
