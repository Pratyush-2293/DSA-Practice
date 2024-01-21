import java.util.*;

public class CountingSort {
    public static void main(String args[]){
        int numbers[] = {5,4,1,3,2};
        _CountingSort(numbers);
        PrintArray(numbers);
    }

    public static void _CountingSort(int nums[]){
        // getting the max value from main array.
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<= nums.length-1;i++){
            maxValue = Math.max(maxValue,nums[i]);
        }
        // creating the new array of length maxValue.
        int count[] = new int[maxValue+1];

        // filling in values of the count array.
        for(int i=0;i<= nums.length-1;i++){
            count[nums[i]]++;
        }

        // filling in the sorted values back to main array.
        int j=0;
        for(int i=0;i<=count.length-1;i++){
            while(count[i]>0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void PrintArray(int nums[]){
        for(int i=0;i<= nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
