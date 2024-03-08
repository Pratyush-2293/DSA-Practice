public class GridWays_BruteForce {
    public static void main(String args[]){
        System.out.println(FindGridWays(0,0, 3, 3));
    }

    public static int FindGridWays(int i, int j, int m, int n){
        // base case
        if(i==m-1 && j==n-1){ // when reached at goal node
            return 1;
        } else if(i==m || j==n){ // boundary case
            return 0;
        }

        // recursion
        int rightWays = FindGridWays(i, j+1, m, n);
        int downWays = FindGridWays(i+1, j, m, n);
        return rightWays + downWays;
    }
}
