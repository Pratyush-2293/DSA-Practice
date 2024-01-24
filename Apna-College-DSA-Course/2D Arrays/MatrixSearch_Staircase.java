import java.util.*;

public class MatrixSearch_Staircase {
    public static void main(String args[]){
        int matrix[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};

        int key = 33;

        StaircaseSearch(matrix,key);
    }

    public static boolean StaircaseSearch(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;

        while(row< matrix.length && col>=0){
            // check key value
            if(matrix[row][col] == key){
                System.out.println("Object found at index: ("+row+","+col+").");
                return true;
            }
            else if(matrix[row][col]>key) {  // action if key is smaller
                col--;
            }
            else{  // action if key is greater
                row++;
            }

        }

        System.out.println("Oject not found!");
        return false;
    }
}
