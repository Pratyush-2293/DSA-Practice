public class Fast_Exponentiation {
    public static void main(String args[]){
        System.out.println(FastExponentiation(5,3));
    }

    public static int FastExponentiation(int a, int n){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }

        return ans;
    }
}
