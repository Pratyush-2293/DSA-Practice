public class Get_ith_Bit {
    public static void main(String args[]){
        System.out.println(GetIthBit(10,3));
    }

    public static int GetIthBit(int num, int i){
        int bitMask = 1<<i;

        if((num & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
}
