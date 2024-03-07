public class NQueens_FindWays {
    public static void main(String args[]){
        // define board size
        int n = 5;
        char board[][] = new char[n][n];
        // initialise the board
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }

        NQueensWays(board, 0); // always enter 0 to start from first row. (redundant and can be removed)
    }

    public static int count = 0;
    public static void PlaceQueens(char board[][], int row){
        // base case
        if(row== board.length){
            count++;
            return;
        }

        // column loop
        for(int j=0;j<board.length;j++){
            if(IsSafe(board,row,j)){
                board[row][j] = 'Q';
                PlaceQueens(board,row+1); // recursive call
                board[row][j] = 'x'; // backtracking step (removing queen from previously placed position)
            }
        }
    }

    public static void NQueensWays(char board[][], int row){
        PlaceQueens(board, row);
        System.out.println("The number of possible ways to arrange queens is: "+count);
    }

    public static boolean IsSafe(char board[][], int row, int column){
        // check vertically above
        for(int i=row-1;i>=0;i--){
            if(board[i][column]=='Q'){
                return false;
            }
        }

        // check diagonally left
        for(int i=row-1,j=column-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // check diagonally right
        for(int i=row-1,j=column+1;i>=0 && j< board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
}