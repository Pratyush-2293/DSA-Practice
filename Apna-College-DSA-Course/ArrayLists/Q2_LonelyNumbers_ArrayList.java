import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q2_LonelyNumbers_ArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);

        System.out.println(LonelyNumbers(list));
    }

    public static ArrayList<Integer> LonelyNumbers(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();

        if(list.size()==0){
            return newList;
        } else if(list.size()==1){
            newList.add(list.get(0));
            return newList;
        }

        for(int i=0;i<list.size();i++){
            boolean isDuplicate = false;
            boolean smallerAdj = false;
            boolean largerAdj = false;

            for(int j=0;j<list.size();j++){
                if(i==j){
                    continue;
                }

                if(list.get(i)==list.get(j)){
                    isDuplicate = true;
                }

                if(list.get(i) == list.get(j)+1){
                    largerAdj = true;
                }

                if(list.get(i) == list.get(j)-1){
                    smallerAdj = true;
                }
            }

            if(!isDuplicate && !smallerAdj && !largerAdj){
                newList.add(list.get(i));
            }
        }

        return newList;
    }
}
