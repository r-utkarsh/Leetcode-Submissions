class Solution {
    public int[] concatWithReverse(int[] nums) {
        ArrayList<Integer> f = new ArrayList<>();
        for(var i:nums) f.add(i);
        ArrayList<Integer> s = new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            s.add(nums[i]);
        }
        f.addAll(s);
        int res[] = new int[nums.length*2];
        for(int i=0;i<res.length;i++){
            res[i] = f.get(i);
        }
        return res;
    }
}