class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(var i:nums){
            sum+=i;
        }
        return sum%k;
    }
}