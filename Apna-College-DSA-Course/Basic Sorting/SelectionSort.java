import java.util.*;

public class SelectionSort {
    public static void main(String args[]){
        int numbers[] = {5,4,1,3,2};
        _SelectionSort(numbers);
        PrintArray(numbers);
    }

    public static void _SelectionSort(int nums[]){
        int minPos = 0;
        for(int i=0;i<= nums.length-2;i++){
            for(int j=i+1;j<= nums.length-1;j++){
                if(nums[minPos]>nums[j]){
                    minPos = j;
                }
            }

            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void PrintArray(int nums[]){
        for(int i=0;i<= nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
