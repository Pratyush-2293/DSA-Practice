public class GridWays_LinearTime {
    public static void main(String args[]){
        System.out.println(FindGridWays(3,3));
    }

    public static int FindGridWays(int n, int m){
        int numerator = Factorial((n-1) + (m-1));
        int denominator = Factorial(n-1) * Factorial(m-1);

        return numerator/denominator;
    }

    public static int Factorial(int n){
        int total = 1;
        for(int i=n;i>1;i--){
            total = total*i;
        }

        return total;
    }

    // Note: we use a math trick to find solution in linear time.
    // the number of paths possible is equal to the permutations of [(n-1) + (m-1)].
    // formula for permutations is:
    // [(n-1) + (m-1)]!/(n-1)! * (m-1)!
}
