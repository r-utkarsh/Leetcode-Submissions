class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int maxIdx = -1, minIdx = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) {
                max = nums[i];
                maxIdx = i;
            }
            if(nums[i]<min) {
                min = nums[i];
                minIdx = i;
            }
        }       
        int front = Math.max(minIdx, maxIdx) +1;
        int back = nums.length - Math.min(minIdx, maxIdx);
        int both = Math.min(minIdx, maxIdx)+1 + nums.length - Math.max(maxIdx, minIdx);
       

        return Math.min(front,Math.min(back, both));
    }
}