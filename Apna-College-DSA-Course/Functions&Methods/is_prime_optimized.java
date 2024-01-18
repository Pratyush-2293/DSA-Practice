public class is_prime_optimized {

    public static Boolean IsPrime(int num){

        if(num==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    //primes in a range
    public static void PrimeRange(int first, int last){
        for(int i=first;i<=last;i++){
            if(IsPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String args[]){
        System.out.println(IsPrime(4));
        PrimeRange(3, 47);
    }
}
