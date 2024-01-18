import java.util.*;

public class dec_to_bin {

    public static void DecToBin(int n){
        int pow = 0;
        int binNum = 0;
        int myNum = n;

        while(n>0){
            int remainder = n%2;
            binNum = binNum + (int)(Math.pow(10, pow) * remainder);
            n = n/2;
            pow++;
        }

        System.out.println("Binary of "+myNum+" is "+binNum);
    }

    public static void main(String args[]){

        DecToBin(9);
    }
}
