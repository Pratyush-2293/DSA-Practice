public class RecursionPrintAscending {
    public static void main(String args[]){
        PrintAscending(10);
    }

    public static void PrintAscending(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintAscending(n-1);
        System.out.print(n+" ");
    }
}
