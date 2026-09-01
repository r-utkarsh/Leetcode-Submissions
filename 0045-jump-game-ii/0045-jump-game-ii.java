class Solution {
    public int jump(int[] nums) {
        // if(nums.length==1) return 0;
        int l=0, r=0, jump=0;
        while(r<nums.length-1){
            jump++;
            int max = -1;
            for(int i=l; i<=r; i++){
                max = Math.max(max, i+nums[i]);
            }
            l=r+1;
            r=max;
            
        }
        return jump;
        
    }
}