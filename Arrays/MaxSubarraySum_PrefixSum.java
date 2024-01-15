import java.util.*;

public class MaxSubarraySum_PrefixSum {
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};

        MaxSubarraySum(numbers);
    }

    public static void MaxSubarraySum(int numbers[]){
        int current_max = 0;
        int total_max = Integer.MIN_VALUE;
        int prefix_array[] = new int[numbers.length];

        //calculate prefix array
        prefix_array[0] = numbers[0];
        for(int i = 1;i< prefix_array.length;i++){
            prefix_array[i] = prefix_array[i-1] + numbers[i];
        }

        for(int i=0;i< numbers.length;i++){
            for(int j=i;j< numbers.length;j++){
                if(i==0){
                    current_max = prefix_array[j];
                }else {
                    current_max = prefix_array[j]-prefix_array[i-1];
                }

                if(total_max<current_max){
                    total_max = current_max;
                }

                current_max = 0;
            }
        }

        System.out.println("Max Subarray Sum is: "+total_max);
    }
}
