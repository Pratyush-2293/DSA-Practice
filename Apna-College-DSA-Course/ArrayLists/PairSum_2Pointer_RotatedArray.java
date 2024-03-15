import java.util.ArrayList;

public class PairSum_2Pointer_RotatedArray {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("The pair sum is present in the list: ");
        System.out.println(CheckPairSum(list, 16));
    }

    public static boolean CheckPairSum(ArrayList<Integer> list, int key){
        int breakPoint = -1;
        int n = list.size();

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                breakPoint = i;
                break;
            }
        }

        int lp = breakPoint+1;
        int rp = breakPoint;

        while(lp!=rp){
            int sum = list.get(lp) + list.get(rp);

            if(sum==key){
                return true;
            }else if(sum<key){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }

            /* This code also works, and is more optimal, but above code is teaching a point.
            int n = list.size();     *division is more expensive, if statement isn't.
            if(rp<0){
                rp = n-1;
            }
            if(lp>n-1){
                lp=0;
            }
            */
        }

        return false;
    }
}
