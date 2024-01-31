public class Is_Power_of_2 {
    public static void main(String args[]){
        System.out.println(IsPowerOfTwo(12));
    }

    public static boolean IsPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
}
