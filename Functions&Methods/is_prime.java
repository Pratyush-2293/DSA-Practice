import java.util.*;

public class is_prime{

    public static Boolean IsPrime(int num){

        if(num==2){
            return true;
        }

        for(int i=2; i<num-1;i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(IsPrime(input));
    }
}