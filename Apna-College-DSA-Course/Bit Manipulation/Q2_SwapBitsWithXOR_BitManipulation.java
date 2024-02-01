public class Q2_SwapBitsWithXOR_BitManipulation {
    public static void main(String args[]){
        SwapNumbers(5, 7);
    }

    public static void SwapNumbers(int a, int b){

        System.out.println("Before swapping: a="+a+" b="+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a="+a+" b="+b);
    }
}

// Task: Swap two variables without using third variable, while using bit manipulation.