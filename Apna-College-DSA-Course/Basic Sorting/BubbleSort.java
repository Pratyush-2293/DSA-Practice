import java.util.*;

public class BubbleSort {
    public static void main(String args[]){
        int numbers[] = {3,5,6,1,7,8};
        _BubbleSort(numbers);
        PrintArray(numbers);
    }

    public static void _BubbleSort(int nums[]){
        int swaps = 0;
        for(int turn=0;turn< nums.length-1;turn++){
            for(int i=0;i<nums.length-1-turn;i++){
                if(nums[i]>nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    swaps++;
                }
                System.out.print("* "); // to check number of iterations
            }

            if(swaps==0){
                break;
            }
        }
    }

    public static void PrintArray(int nums[]){
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}


//Note: This bubble sort can be optimised by adding a swap counter, for cases where the array is already sorted.
// even if the array is already sorted, a non optimised bubble sort will still go through all checks.
// to prevent this, we add a swap counter in the innermost loop, if no swap occurs after traversing through the array,
// we can conclude that the array is already sorted.