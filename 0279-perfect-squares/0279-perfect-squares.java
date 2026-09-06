class Solution {
    public int numSquares(int n) {
        HashSet<Integer> lst = new HashSet<>();
        for(int i=0;i<=n/2;i++){
            lst.add(i*i);
        }
        int dp[] = new int[n+1];

        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<dp.length;i++){
            if(lst.contains(i)) dp[i]=1;
            else {
                int l=1, r=i-1, min = Integer.MAX_VALUE;
                while(l<=r){
                    min = Math.min(dp[l]+dp[r], min);
                    if(min==2) break;
                    l++;
                    r--;
                }
                dp[i]=min;
            }
            
        }

        return dp[n];
    }
}