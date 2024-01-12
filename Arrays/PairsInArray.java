import java.util.*;

public class PairsInArray {
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        PrintPairs(numbers);
    }

    public static void PrintPairs(int numbers[]){
        int totalPairs = 0;
        for(int i=0;i< numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+") ");
                totalPairs++;
            }
            System.out.println();
        }

        System.out.println("Total Pairs: "+totalPairs);
    }
}


//Note:
//total pairs in an array = n(n-1)/2
//where n is the number of elements in the array.