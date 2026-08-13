class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int cnt=0;
        for(var i:nums){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        if(k==0){
            for(var i:mp.keySet()){
                if(mp.get(i)>=2) cnt++;
            }
        }
        else{
            for(var i :mp.keySet()){
                if(mp.containsKey(i+k)) cnt++;
            }
        }
        
        return cnt;
    }
}
// sort then fixed sliding window