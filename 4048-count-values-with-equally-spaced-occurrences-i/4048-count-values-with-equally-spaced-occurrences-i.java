class Solution {
    public int countSpecialIntegers(int[] nums) {
        int cnt = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(var i : nums){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        ArrayList<Integer> lst = new ArrayList<>();
        for(var i : mp.keySet()){
            if(mp.get(i)==3) lst.add(i);
        }
        for(int i=0;i<nums.length-1;i++){
      
            if(lst.contains(nums[i])) {
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