class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int dp[][] = new int[n][n];
        for(int []i: dp){
            Arrays.fill(i, Integer.MIN_VALUE);
        }
        int ans = Integer.MAX_VALUE;
        for(int j = 0;j<n;j++){
            ans = Math.min(ans, help(grid, 0, j, dp, n));
        }
        return ans;
    }
    static int help(int arr[][], int i, int j, int dp[][], int n){
        if(j==-1 || j==n) return Integer.MAX_VALUE;
        if(i==n-1) return arr[i][j];
        
        if(dp[i][j] != Integer.MIN_VALUE) return dp[i][j];
        int ans=0, best = Integer.MAX_VALUE;

        for(int k=0;k<n;k++){
            if(k==j) continue;
            ans =  help(arr, i+1, k, dp, n);
            best = Math.min(ans, best);   
        }
        
        dp[i][j] = arr[i][j] + best;
        return dp[i][j];
        
    }
}