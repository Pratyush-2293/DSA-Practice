import java.util.ArrayList;
public class ContainerWithMostWater_BruteForce {
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

    public static int FindMaxWater(ArrayList<Integer> heights){
        int maxWater = 0;

        for(int i=0;i<heights.size();i++){
            for(int j=i+1;j<heights.size();j++){
                int minHeight = Math.min(heights.get(i), heights.get(j));
                int width = j-i;
                int currentWater = minHeight * width;

                maxWater = Math.max(currentWater, maxWater);
            }
        }

        return maxWater;
    }
}
