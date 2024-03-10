import java.util.ArrayList;
public class ContainerWithMostWater_2Pointer {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(FindMaxWater(list));
    }

    public static int FindMaxWater(ArrayList<Integer> hList){
        int maxWater = 0;
        int lp = 0;
        int rp = hList.size() - 1;

        while(lp<rp){
            //calc water area
            int width = rp-lp;
            int minHeight = Math.min(hList.get(lp), hList.get(rp));
            int currentWater = width * minHeight;
            maxWater = Math.max(currentWater,maxWater);

            //increment ptrs
            if(hList.get(lp)<hList.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

        return maxWater;
    }
}
