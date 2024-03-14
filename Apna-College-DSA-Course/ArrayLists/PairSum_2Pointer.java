import java.util.ArrayList;

public class PairSum_2Pointer {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("The key 4 is present in the arraylist: ");
        System.out.println(CheckPairSum(list, 4));
    }

    public static boolean CheckPairSum(ArrayList<Integer> list, int key){
        int lp = 0;
        int rp = list.size()-1;

        while(lp<rp){
            int sum = list.get(lp) + list.get(rp);

            if(sum==key){
                return true;
            }else if(sum<key){
                lp++;
            }else{
                rp--;
            }
        }

        return false;
    }
}