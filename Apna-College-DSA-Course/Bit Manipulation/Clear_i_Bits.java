public class Clear_i_Bits {
    public static void main(String args[]){
        System.out.println(ClearIBits(15,2));
    }

    public static int ClearIBits(int num, int i){
        int bitMask = (~0)<<i;
        return num & bitMask;
    }
}
