import java.util.*;

public class MaxSubarraySum_Kadane {
    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};

        KadaneSum(numbers);
    }

    public static void KadaneSum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i< numbers.length;i++){
            currSum = currSum + numbers[i];
            if(currSum<0){
                currSum = 0;
            }

            maxSum = Math.max(currSum,maxSum);
        }

        System.out.println("Max Subarray Sum is: "+maxSum);
    }
}

// *** Important Algorithm ***

//Note: in some cases, if all elements in array are negative, question will either ask you to print maxSum as 0,
// While some questions may require you to add a loop which finds the smallest negative number and print that.