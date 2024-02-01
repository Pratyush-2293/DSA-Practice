public class Q1_BitManipulation {
    public static void main(String args[]){
        System.out.println(FindxPowerx(3));
    }

    public static int FindxPowerx(int x){
        int ans = 1;
        int n = x;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * x;
            }
            x = x*x;
            n = n>>1;
        }

        return ans;
    }
}


// Task: Find ans of x^x, for given no. x.