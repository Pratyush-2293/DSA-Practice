public class CheckSortedArray_Recursion {
    public static void main(String args[]){
        int arr[] = {1,2,4,4,5};
        System.out.println(CheckSorted(arr, 0));
    }

    public static Boolean CheckSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return CheckSorted(arr, i+1);
    }
}
