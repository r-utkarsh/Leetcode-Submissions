class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        // int c1 = help(nums, 0);
        // int c2 = help2(nums, 1);
        // return Math.max(c1, c2);
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2; i<nums.length-1;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        int dp2[] = new int[nums.length];
        dp2[0] = 0;
        dp2[1] = nums[1];
        for(int i=2; i<nums.length;i++){
            dp2[i] = Math.max(dp2[i-1], dp2[i-2]+nums[i]);
        }
        return Math.max(dp[nums.length-2], dp2[nums.length-1]);

    }


    // static int help(int nums[], int i){
    //     if(i>=nums.length-1) return 0;

    //     int take = nums[i]+ help(nums, i+2);
    //     int skip = 0+help(nums, i+1);
       
    //     return Math.max(skip, take);
    // }
    // static int help2(int nums[], int i){
    //     if(i>=nums.length) return 0;

    //     int take = nums[i]+ help2(nums, i+2);
    //     int skip = 0+help2(nums, i+1);
       
    //     return Math.max(skip, take);
    // }
}

