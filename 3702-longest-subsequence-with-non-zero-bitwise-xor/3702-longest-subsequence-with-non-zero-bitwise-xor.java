class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0, n=nums.length;
        boolean allZero=true;
        for(int i=0;i<n;i++){
            ans^=nums[i];
            if(nums[i]!=0){
                allZero = false;
            } 
        }
        if(allZero) return 0;
        return ans==0?n-1:n;

    
    }
}