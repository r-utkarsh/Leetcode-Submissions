class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans=0;
        for(var i:nums){
            if(i%2==0){
                ans|=i;
            }  
        }
        return ans;
    }
}