class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int[] i:dp){
            Arrays.fill(i, -1);
        }
        
        return help(grid, 0, 0, dp, m, n);
    }
    static int help(int grid[][], int i, int j, int dp[][], int m, int n){
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        if(i>=m || j>=n) return Integer.MAX_VALUE;

        if(dp[i][j] != -1) return dp[i][j];

        int down = help(grid, i+1, j, dp, m, n);
        int right = help(grid, i, j+1, dp, m, n);

        return dp[i][j] = grid[i][j] + Math.min(down,right);
    }
}