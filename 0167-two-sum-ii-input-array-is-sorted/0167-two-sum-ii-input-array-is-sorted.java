class Solution {
    public int[] twoSum(int[] nums, int t) {
        LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i], i);
        }
        System.out.println(mp);
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(t-nums[i])) return new int[]{i+1, mp.get(t-nums[i])+1};
        }
        return new int[]{0,1};
    }
}