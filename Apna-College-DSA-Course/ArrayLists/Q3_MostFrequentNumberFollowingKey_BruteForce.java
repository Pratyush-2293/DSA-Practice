import java.util.ArrayList;

public class Q3_MostFrequentNumberFollowingKey_BruteForce {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println(MostFrequentNumberFollowingKey(list, 2));
    }

    public static int MostFrequentNumberFollowingKey(ArrayList<Integer> list, int key){
        int globalMaxCount = 0;
        int globalTarget = 0;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==key){
                int target = list.get(i+1);
                int count = 0;
                for(int j=0;j<list.size()-1;j++){
                    if(list.get(j)==key && list.get(j+1)==target){
                        count++;
                    }
                }

                if(count>globalMaxCount){
                    globalMaxCount = count;
                    globalTarget = target;
                }
            }
        }

        return globalTarget;
    }
}
