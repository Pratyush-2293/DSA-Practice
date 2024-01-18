public class MaxSubarraySum_BruteForce {
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};

        MaxSubarraySum(numbers);
    }

    public static void MaxSubarraySum(int numbers[]){
        int current_max = 0;
        int total_max = Integer.MIN_VALUE;

        for(int i=0;i< numbers.length;i++){
            for(int j=i;j< numbers.length;j++){
                for(int k=i;k<=j;k++){
                    current_max += numbers[k];
                }
                System.out.println(current_max);
                if(total_max<current_max){
                    total_max = current_max;
                }
                current_max = 0;
            }
        }

        System.out.println("Max Subarray Sum is: "+total_max);
    }
}
