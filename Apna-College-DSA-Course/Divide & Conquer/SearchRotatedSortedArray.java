public class SearchRotatedSortedArray {
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(ModifiedBinarySearch(arr, target, 0, arr.length-1));
    }

    public static int ModifiedBinarySearch(int arr[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        // Found on mid
        if(arr[mid]==target){
            return mid;
        }
        // Mid on Line 1
        if(arr[si]<=arr[mid]){
            // left of mid
            if(target>=arr[si] && target<=arr[mid]){
                return ModifiedBinarySearch(arr,target,si,mid-1);
            } else{
                // right of mid
                return ModifiedBinarySearch(arr, target, mid+1,ei);
            }
        } else{
            // Mid on Line 2

            // right of mid
            if(target>=arr[mid] && target<=arr[ei]){
                return ModifiedBinarySearch(arr,target,mid+1,ei);
            } else{
                // left of mid
                return ModifiedBinarySearch(arr,target,si,mid-1);
            }
        }
    }
}