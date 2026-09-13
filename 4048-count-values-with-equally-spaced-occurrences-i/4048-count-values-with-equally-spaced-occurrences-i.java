class Solution {
    public int countSpecialIntegers(int[] nums) {
        int cnt = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(var i : nums){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        
        for(int i=0;i<nums.length-1;i++){
      
            if(mp.get(nums[i])==3) {
                // search for the same element ahead
                for(int j = i+1;j<nums.length; j++){
                    if(nums[j] == nums[i]){
                        int dif = j-i;
                        if((j+dif)<nums.length && nums[i] == nums[j+dif]) {
                            cnt++;
                            break;
                        }
                    }
                    
                }
                
            }
            
        }
        return cnt;
    }
}