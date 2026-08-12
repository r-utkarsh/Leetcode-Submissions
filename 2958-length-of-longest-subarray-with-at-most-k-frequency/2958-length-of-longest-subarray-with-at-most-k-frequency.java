class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(var i: nums){
            mp.put(i, 0);
        }
        int i=0,j=0,maxl=0;
        
        while(j<nums.length){
            if(mp.get(nums[j])<k){
                maxl = Math.max(maxl,j-i+1);
                mp.put(nums[j], mp.get(nums[j])+1);
                j++;
            }
            else{
                mp.put(nums[i], mp.get(nums[i])-1);
                i++;
            }
        }
        return maxl;
    }
}

// just use one map in which add the number you have used 
// HashMap<Integer,Integer> used = new HashMap<>();
        // for(var dig:nums){
        //     used.put(dig,0);
        // }