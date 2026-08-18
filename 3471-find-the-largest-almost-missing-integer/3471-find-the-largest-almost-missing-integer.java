class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(var i:nums){
            mp.put(i, mp.getOrDefault(i, 0)+1);
            max = Math.max(max,i);
        }
        int ans = -1;

        if (k == nums.length) return max;

        if (k == 1) {
            for (int num : nums) {
                if (mp.get(num) == 1) {
                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }

        int f = nums[0];
        int l = nums[nums.length - 1];

        if (mp.get(f) == 1) ans = Math.max(ans, f);


        if (mp.get(l) == 1) ans = Math.max(ans, l);

        return ans;
    }
}



















// if(mp.size()==1) return -1;
        // int maxf = Math.max(nums[0],nums[nums.length-1]);
        // int min = nums[0]+nums[nums.length-1]-maxf;
        // if(mp.get(maxf)==1) return maxf;
        // return min;
        // // return 0;