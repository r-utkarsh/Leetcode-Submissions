class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(var i: nums){
            hs.add(i);
        }

        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1) sum+=nums[i];
            else break;
        }

        for(int i=sum;i<1300;i++){
            if(!hs.contains(i)) return i; 
        }
        return 0;
    }
}

