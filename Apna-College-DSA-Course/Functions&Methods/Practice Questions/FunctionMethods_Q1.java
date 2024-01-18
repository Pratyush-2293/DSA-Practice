import java.util.*;

public class FunctionMethods_Q1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        System.out.println("Average is: "+ Average(a, b, c));
    }

    public static float Average(float num1, float num2, float num3){
        float total = num1 + num2 + num3;
        float avg = total/3;

        return avg;
    }
}