public class QuickSelect {
    public static void main(String args[]){
        int arr[] = {8,3,5,7,6,1,4,2};
        System.out.println(QuickSelect_(arr, 0, arr.length-1,9));
    }
    
    public static int QuickSelect_(int arr[], int si, int ei, int k){
        if(si<ei){
            int pivotIndex = Partition(arr, si, ei);
            if(pivotIndex == k-1){
                return arr[pivotIndex];
            } else if (pivotIndex>k-1) {
                return QuickSelect_(arr,si,pivotIndex-1,k);
            } else{
                return QuickSelect_(arr,pivotIndex+1, ei,k);
            }
        }
        return -1;
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
}
