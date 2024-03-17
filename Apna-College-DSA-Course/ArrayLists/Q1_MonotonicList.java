import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q1_MonotonicList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        //list.add(4);

        System.out.println(CheckMonotone(list));
    }

    public static boolean CheckMonotone(ArrayList<Integer> list){
        boolean isAscending = true;
        boolean isDescending = true;

        for(int i=0;i<list.size()-1;i++){
            // ascending check
            if(list.get(i)>=list.get(i+1)){
                isAscending = false;
            }

            // descending check
            if(list.get(i)<=list.get(i+1)){
                isDescending = false;
            }
        }

        return isAscending || isDescending;
    }
}
