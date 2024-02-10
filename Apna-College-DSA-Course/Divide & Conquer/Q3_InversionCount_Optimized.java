public class Q3_InversionCount_Optimized {
    public static void main(String args[]){
        int arr[] = {2,4,1,3,5};
        System.out.println(GetInversion(arr));
    }

    public static int MergeSort(int arr[], int si, int ei){
        int invCount = 0;
        if(ei>si){
            int mid = (si+ei)/2;
            invCount += MergeSort(arr,si,mid); // add invs of left
            invCount += MergeSort(arr,mid+1,ei); // add invs of right
            invCount += Merge(arr, si, mid+1, ei); // add invs during merge
        }

        return invCount;
    }

    public static int  Merge(int arr[], int si, int mid, int ei){
        int i = si;
        int j = mid;
        int k = 0;
        int invCount = 0;
        int temp[] = new int[(ei-si+1)];

        while(i<mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                invCount += (mid-i);
                j++;
                k++;
            }
        }

        while(i<mid){
            temp[k]=arr[i];
            i++;
            k++;
        }

        while(j<=ei){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(int r=si, c=0;r<=ei;r++,c++){
            arr[r] = temp[c];
        }

        return invCount;
    }

    public static int GetInversion(int arr[]){
         return MergeSort(arr, 0, arr.length-1);
    }
}
