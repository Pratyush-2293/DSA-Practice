public class RecursionPrintDescending {
    public static void main(String args[]){
        int n = 10;
        PrintDescending(n);
    }

    public static void PrintDescending(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        PrintDescending(n-1);
    }
}
