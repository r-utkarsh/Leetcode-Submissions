class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int dp[][] = new int[n][n];
        for(int i[]:dp){
            Arrays.fill(i, Integer.MIN_VALUE);
        }
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            ans = Math.min(ans, help(matrix, 0, j, dp, n));
        }
        return ans;
    }
    static int help(int mat[][], int i, int j, int dp[][], int n){
        if(j==-1 || j==n) return Integer.MAX_VALUE;
        if(i==n-1){
            return mat[i][j];
        }

        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];

        int left = help(mat, i+1, j-1, dp, n);
        int mid = help(mat, i+1, j, dp, n);
        int right = help(mat, i+1, j+1, dp, n);

        dp[i][j] = mat[i][j] + Math.min(left, Math.min(mid, right));
        return dp[i][j];
    }
}