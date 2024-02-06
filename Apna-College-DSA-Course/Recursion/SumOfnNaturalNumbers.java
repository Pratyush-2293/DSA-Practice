public class SumOfnNaturalNumbers {
    public static void main(String args[]){
        System.out.println(PrintSum(5));
    }

    public static int PrintSum(int n){
        if(n==1){
            return 1;
        }
        return n + PrintSum(n-1);
    }
}
