import java.util.*;

public class Q3_TransposeMatrix_2DArrays {
    public static void main(String args[]){
        int nums[][] = {
                {1,2,3},
                {4,5,6}
        };

        TransposeMatrix(nums);
    }

    public static void TransposeMatrix(int matrix[][]){
        int transpose[][] = new int[matrix[0].length][matrix.length];

        for(int i=0;i<= matrix.length-1;i++){
            for(int j=0;j<=matrix[0].length-1;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        PrintMatrix(transpose);
    }

    public static void PrintMatrix(int matrix[][]){

        for(int i=0;i<=matrix.length-1;i++){
            for(int j=0;j<=matrix[0].length-1;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
