class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int dec = 1, inc = 1, longest = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                inc++;
            }
            else inc=1;
            if(nums[i]<nums[i-1]){
                dec++;
            }
            else dec=1;
            longest = Math.max(longest, Math.max(inc, dec));
        }
        return longest;
    }
}