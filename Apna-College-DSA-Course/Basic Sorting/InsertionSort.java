import java.util.*;

public class InsertionSort {
    public static void main(String args[]){
        int numbers[] = {5,4,1,3,2};
        _InsertionSort(numbers);
        PrintArray(numbers);
    }

    public static void _InsertionSort(int nums[]){
        for(int i=1;i< nums.length;i++){
            int temp = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }
    }

    public static void PrintArray(int nums[]){
        for(int i=0;i<= nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
