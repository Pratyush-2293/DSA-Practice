public class Clear_ith_Bit {
    public static void main(String args[]){
        System.out.println(ClearIthBit(10,1));
    }

    public static int ClearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        return num & bitMask;
    }
}