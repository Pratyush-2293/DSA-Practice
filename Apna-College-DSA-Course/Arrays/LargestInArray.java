import java.util.*;

public class LargestInArray {
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};

        System.out.println("Largest value in the array is: "+GetLargest(numbers));
    }

    public static int GetLargest(int numbers[]){
        int currentMax = Integer.MIN_VALUE;

        for(int i=0;i< numbers.length;i++){
            if(numbers[i]>currentMax){
                currentMax = numbers[i];
            }
        }

        return currentMax;
    }
}
