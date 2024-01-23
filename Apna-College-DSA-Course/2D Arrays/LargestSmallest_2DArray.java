
import java.util.*;
public class LargestSmallest_2DArray {
    public static void main(String args[]){
        int numbers[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i< numbers.length;i++){
            for(int j=0;j<numbers[0].length;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i=0;i< numbers.length;i++){
            for(int j=0;j<numbers[0].length;j++){
                System.out.print(numbers[i][j]+" ");

                if(numbers[i][j]<minValue){
                    minValue = numbers[i][j];
                }
                if(numbers[i][j]>maxValue){
                    maxValue = numbers[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Min Value is: "+minValue);
        System.out.println("Max Value is: "+maxValue);
    }
}
