import java.util.*;

public class LinearSearch {
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16};
        String menu[] = {"samosa","chhole bhature","dosa","sambar vada","poha"};
        int key = 20;
        String order = "poha";

        //number array example
        int index = LinearSearch(numbers, key);

        if(index==-1){
            System.out.println("Number not found.");
        }else{
            System.out.println("Number found at index: "+index);
        }

        //string array example
        int stringIndex = StringLinearSearch(menu,order);

        if(stringIndex==-1){
            System.out.println("Item not found in menu.");
        }else{
            System.out.println("Order found at index: "+stringIndex);
        }
    }

    public static int LinearSearch(int[] nums, int key){
        for(int i=0;i< nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }

        return -1;
    }

    public static int StringLinearSearch(String[] stringsArray, String stringKey){
        for(int i=0;i< stringsArray.length;i++){
            if(stringsArray[i]==stringKey){
                return i;
            }
        }

        return -1;
    }
}
