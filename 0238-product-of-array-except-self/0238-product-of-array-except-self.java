class Solution {
    public int[] productExceptSelf(int[] nums) {
        int cntz=0, prod = 1;
        for(var i : nums){
            if(i==0)cntz++;
            else prod*=i;
        }
        // System.out.println(prod);
        // System.out.println(cntz);
        if(cntz>1) return new int[nums.length];
        else {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0) nums[i]=prod;
                else if(cntz==1) nums[i]=0;
                else nums[i]=prod/nums[i];
            }
        }
        return nums;
    }
}