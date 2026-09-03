class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int f = nums.length/3;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(var i : nums){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        List<Integer> lst = new ArrayList<>();
        for(var i : mp.keySet()){
            if(mp.get(i)>f) lst.add(i);
        }
        return lst;
    }
}