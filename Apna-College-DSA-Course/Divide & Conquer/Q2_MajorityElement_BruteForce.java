public class Q2_MajorityElement_BruteForce {
    public static void main(String args[]){
        int nums[] = {1,1,1,2,2,2,2,2,2};
        System.out.println(MajorityElement(nums));
    }

    public static int MajorityElement(int arr[]){
        int mBoundary = arr.length/2;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>mBoundary){
                return arr[i];
            }
        }

        return -1;
    }
}
