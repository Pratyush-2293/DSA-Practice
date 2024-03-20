import java.util.ArrayList;

public class Q3_MostFrequentNumberFollowingKey_Linear {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);

        System.out.println(MostFrequentNumberFollowingKey(list, 1));
    }

    public static int MostFrequentNumberFollowingKey(ArrayList<Integer> list, int key){
        // using count table method.
        int count[] = new int[1000];

        // updating counts table
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                count[list.get(i+1)-1]++;
            }
        }

        // finding target with most counts
        int maxCount = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0;i<1000;i++){
            if(maxCount<count[i]){
                maxCount = count[i];
                ans = i+1;
            }
        }

        return ans;
    }
}
