public class QuickSort {
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        QuickSort_(arr,0,arr.length-1);
        PrintArray(arr);
    }

    public static void QuickSort_(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pivotIndex = Partition(arr, si, ei);
        QuickSort_(arr,si,pivotIndex-1); // left of pivot
        QuickSort_(arr,pivotIndex+1,ei); // right of pivot
    }

    public static int Partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;

        return i;
    }

    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


// Note: Quick Sort gives worst case time complexity O(n^2) when the pivot is either the largest or the
// smallest element in the array, i.e. the array is already sorted in either ascending or descending order.