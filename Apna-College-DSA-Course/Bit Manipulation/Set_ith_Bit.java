public class Set_ith_Bit {
    public static void main(String args[]){
        System.out.println(SetIthBit(10,2));
    }

    public static int SetIthBit(int num, int i){
        int bitMask = 1<<i;
        return num | bitMask;
    }
}
