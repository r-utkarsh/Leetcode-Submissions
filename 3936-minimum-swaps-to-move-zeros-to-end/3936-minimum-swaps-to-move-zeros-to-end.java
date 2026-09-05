class Solution {
    public int minimumSwaps(int[] nums) {
        int cnt = 0, ans = 0;
        for(var i:nums){
            if(i==0) cnt++;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(cnt>0 && nums[i]!=0){
                ans++;
                cnt--;
            }
            else if(nums[i] == 0)cnt--;
        }
        return ans;
    }
}