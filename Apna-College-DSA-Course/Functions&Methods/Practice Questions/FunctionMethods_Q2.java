import java.util.*;

public class FunctionMethods_Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        TestProgram();
    }

    // Even Checker
    public static boolean IsEven(int num){

        if(num%2==0){
            return true;
        }
        return false;
    }

    // Test Program
    public static void TestProgram(){

        if(IsEven(6)==true){
            System.out.println("Method has answered Even, which is correct.");
        }
        else{
            System.out.println("Method has answered Odd, which is wrong.");
        }

        if(IsEven(3)==true){
            System.out.println("Method has answered Even, which is wrong.");
        }
        else{
            System.out.println("Method has answered Odd, which is correct.");
        }
    }
}
