public class NQueens_AllSolutionsPrint {
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

        PlaceQueens(board,0);
    }

    public static void PlaceQueens(char board[][], int row){
        // base case
        if(row== board.length){
            PrintBoard(board);
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

    public static void PrintBoard(char board[][]){
        System.out.println("----------Chess Board----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
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