import java.util.ArrayList;

public class FindMax_ArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(4);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
        }

        System.out.println(max);
    }
}
