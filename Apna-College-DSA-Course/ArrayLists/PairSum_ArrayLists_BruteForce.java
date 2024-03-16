import java.util.ArrayList;

public class PairSum_ArrayLists_BruteForce {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("The target sum 5 is present in the list: ");
        System.out.println(CheckPairSum(list, 5));
    }

    public static boolean CheckPairSum(ArrayList<Integer> list, int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int sum = list.get(i) + list.get(j);
                if(sum==target){
                    return true;
                }
            }
        }

        return false;
    }
}
