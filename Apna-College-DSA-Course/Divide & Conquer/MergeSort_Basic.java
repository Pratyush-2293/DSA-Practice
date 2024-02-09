public class MergeSort_Basic {
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        MergeSort(arr, 0, arr.length-1);
        PrintArray(arr);
    }

    public static void MergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2; // equal to (si+ei)/2
        MergeSort(arr, si, mid); // merge sort for left
        MergeSort(arr, mid+1, ei); // merge sort for right
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // pointer for left
        int j = mid+1; // pointer for right
        int k = 0; // pointer for temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // if elements remaining in left:
        while(i<=mid){
            temp[k] = arr[i];
            k++;
            i++;
        }

        // if element remaining in right:
        while(j<=ei){
            temp[k] = arr[j];
            k++;
            j++;
        }

        // copying array temp to main array. note that we have a second pointer
        // to keep track of position in main array, so as not to write all elements
        // from the beginning and keep overwriting.
        for(int n=0, r=si;n<temp.length;n++, r++){
            arr[r] = temp[n];
        }
    }

    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
