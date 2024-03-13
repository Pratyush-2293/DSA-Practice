import java.util.ArrayList;

public class MultiDimensional_ArrayLists {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5;i++){
            list1.add(i*1); // table of 1
            list2.add(i*2); // table of 2
            list3.add(i*3); // table of 3
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        for(int i=0;i<3;i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<5;j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
