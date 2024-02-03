public class nthFibonacci {
    public static void main(String args[]){
        System.out.println(Fibonacci(23));
    }

    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
