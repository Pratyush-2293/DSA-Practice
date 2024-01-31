public class Update_ith_Bit {
    public static void main(String args[]){
        System.out.println(UpdateIthBit_Advanced(10,2,1));
    }

    public static int UpdateIthBit_Basic(int num, int i, int val){  // Basic update, using previously made functions
        if(val==0){
            return ClearIthBit(num, i);
        }
        else{
            return SetIthBit(num, i);
        }
    }

    public static int UpdateIthBit_Advanced(int num, int i, int val){  // requires one less pre-made function
        int n = ClearIthBit(num, i);
        int bitMask = val<<i;
        return n | bitMask;
    }

    public static int ClearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        return num & bitMask;
    }

    public static int SetIthBit(int num, int i){
        int bitMask = 1<<i;
        return num | bitMask;
    }
}
