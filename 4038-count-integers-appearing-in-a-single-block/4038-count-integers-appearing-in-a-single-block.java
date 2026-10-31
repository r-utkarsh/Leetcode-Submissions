class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] bcount = new int[101];
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                bcount[nums[i]]++;
            }
        }
        
        int ans = 0;
        for (int count : bcount) {
            if (count == 1) {
                ans++;
            }
        }
        
        return ans;
    }
}