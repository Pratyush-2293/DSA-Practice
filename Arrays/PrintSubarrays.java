import java.util.*;

public class PrintSubarrays {
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};

        PrintSubarrays(numbers);
    }

    public static void PrintSubarrays(int nums[]){
        for(int i=0;i< nums.length;i++){
            // i = start
            for(int j=i;j< nums.length;j++){
                // j = end
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

//Note: Sum of all sub arrays in an array is given by: n(n+1)/2