import java.util.*;

public class Q3_BitManipulation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Adding one using bit manipulation: x="+ -~x);
    }
}

// Task: Add one to any number x, using bit manipulation.
// Logic: -x = ~x + 1;
// => -~x = x + 1;