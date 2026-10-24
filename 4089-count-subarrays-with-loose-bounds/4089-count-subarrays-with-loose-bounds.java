class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int i=0, j=0, n=nums.length;
        long cnt=0;
        while(i<n){
            while(j<n && nums[j]>=minK && nums[j]<=maxK){
                j++;
            }
            long k=j-i;
            cnt+= (k*(k+1))/2;
            i=j+1;
            j++;
        }
        return cnt;
    }
}