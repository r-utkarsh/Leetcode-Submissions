class Solution {
    public int peakValleyDifference(int[] nums) {
        int p=0, v=0, n=nums.length;
        for(int i=1;i<n-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                p+=nums[i];
            }
            else if(nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                v +=nums[i];
            }
        }
        return p-v;
    }
}