public class XtoPowerN {
    public static void main(String args[]){
        System.out.println(XPowerN(2,5));
    }

    public static int XPowerN(int x, int n){
        if(n==0){
            return 1;
        }
        return x * XPowerN(x, n-1);
    }
}
