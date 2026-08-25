class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0, idx=0;
        int res[]= new int[2*n];
        while(i<n){
            res[idx] = nums[i];
            res[idx+1] = nums[n+i];
            i++;
            idx+=2;
        }
        return res;
    }
}