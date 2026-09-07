class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max=0;
        for(int i=0; i<nums.length;i++){
            for(int j=i; j<nums.length;j++){
                int ans = Math.abs(nums[i]-nums[j]);
                if(ans <= Math.min(nums[i], nums[j])){
                    max = Math.max(nums[i]^nums[j], max);
                }
            }
        }
        return max;
    }
}