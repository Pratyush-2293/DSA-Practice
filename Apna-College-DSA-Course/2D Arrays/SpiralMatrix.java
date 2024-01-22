import java.util.*;

public class SpiralMatrix {
    public static void main(String args[]){
        int matrix[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        PrintSpiralMatrix(matrix);
    }

    public static void PrintSpiralMatrix(int matrix[][]){
        int colStart = 0;
        int rowStart = 0;
        int colEnd = matrix[0].length-1;
        int rowEnd = matrix.length-1;

        while(rowStart<=rowEnd && colStart<=colEnd){

            // print top edge
            for(int j = colStart;j<=colEnd;j++){
                System.out.print(matrix[rowStart][j]+" ");
            }

            // print right edge
            for(int i = rowStart+1;i<=rowEnd;i++){
                System.out.print(matrix[i][colEnd]+" ");
            }

            // print bottom edge
            for(int j=colEnd-1;j>=colStart;j--){
                if(rowStart==rowEnd){
                    break;
                }
                System.out.print(matrix[rowEnd][j]+" ");
            }

            // print left edge
            for(int i=rowEnd-1;i>=rowStart+1;i--){
                if(colEnd==colStart){
                    break;
                }
                System.out.print(matrix[i][colStart]+" ");
            }

            colStart++;
            rowStart++;
            colEnd--;
            rowEnd--;
        }
    }
}
