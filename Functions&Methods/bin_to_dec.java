public class bin_to_dec {

    public static void BinToDec(int binNum){
        int pow = 0;
        int decNum = 0;
        int savedBinary = binNum;

        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        
        System.out.println("Decimal of "+savedBinary+" is "+decNum);
    }

    public static void main(String args[]){
        BinToDec(101);
    }
}
