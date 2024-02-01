public class OddEven {
    public static void main(String args[]){
        CheckOddEven(6);
    }

    public static void CheckOddEven(int num){
        int bitMask = 1;

        if((num & 1) == 0){
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number is odd.");
        }
    }
}
