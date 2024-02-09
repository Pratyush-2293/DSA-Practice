public class Q2_MajorityElement_Recursive {
    public static void main(String args[]){
        int nums[] = {2,2,2,1,1,1,2,2,2};
        System.out.println(MajorityElement(nums));
    }

    public static int CountInRange(int arr[], int num, int si, int ei){
        int count = 0;
        for(int i=si;i<=ei;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }

    public static int MajorityElementRec(int arr[], int si, int ei){
        //base case
        if(si==ei){
            return arr[si];
        }

        int mid = si + (ei-si)/2;
        int leftMaj = MajorityElementRec(arr, si, mid); // left
        int rightMaj = MajorityElementRec(arr, mid+1, ei); // right

        if(leftMaj == rightMaj){  // left and right agree on majority element
            return leftMaj;
        }

        int leftCount = CountInRange(arr, leftMaj, si, ei);  // when left and right don't agree
        int rightCount = CountInRange(arr, rightMaj,si,ei);

        if(leftCount>rightCount){
            return leftMaj;
        }else{
            return rightMaj;
        }
    }

    public static int MajorityElement(int arr[]){
        return MajorityElementRec(arr, 0, arr.length-1);
    }
}
