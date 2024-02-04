public class OptimizedXtoPowerN {
    public static void main(String args[]){
        System.out.println(OptimizedPower(2, 10));
    }

    public static int OptimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfOfPowerSplit = OptimizedPower(x, n/2);
        int powerSplit = halfOfPowerSplit * halfOfPowerSplit;
        // if power is odd
        if(n%2 != 0){
            powerSplit = x * powerSplit;
        }

        return powerSplit;
    }
}
