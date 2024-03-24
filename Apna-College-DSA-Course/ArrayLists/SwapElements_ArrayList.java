import java.util.ArrayList;

public class SwapElements_ArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Before swapping: ");
        System.out.println(list);
        System.out.println("After Swapping: ");
        Swap(list, 2, 3);
        System.out.println(list);
    }

    public static void Swap(ArrayList<Integer> list, int idx1, int idx2){
        Integer temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
}
