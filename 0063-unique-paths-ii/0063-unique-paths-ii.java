class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {

        int dp[][] = new int[101][101];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }        
        return help(grid, 0, 0, dp);
    }
    static int help(int grid[][], int i, int j, int dp[][]){
        int m = grid.length;
        int n = grid[0].length;
        if(grid[m-1][n-1] == 1) return 0; 
        if(i==m-1 && j==n-1) return 1;
        if(i>=m || j>=n || grid[i][j] == 1) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int right = help(grid, i+1, j, dp);
        int down = help(grid, i, j+1, dp);
        
        return dp[i][j] = right+down;
    }
}