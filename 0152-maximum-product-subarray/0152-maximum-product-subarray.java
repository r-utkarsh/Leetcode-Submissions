class Solution {
    public int maxProduct(int[] nums) {
        int maxDp[]= new int[nums.length];
        int minDp[]= new int[nums.length] ;
        maxDp[0] = nums[0];
        minDp[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            int prod1 = nums[i]*maxDp[i-1];
            int prod2 = nums[i]*minDp[i-1];
            maxDp[i] = Math.max(nums[i], Math.max(prod1, prod2));
            minDp[i] = Math.min(nums[i], Math.min(prod1, prod2));
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(maxDp[i], max);
        }
    
        return max;
        
    }

}