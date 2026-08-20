class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> f = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        f.add(nums[0]);
        s.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            // last element f>last element s f.add otherwise s.add
            if(f.get(f.size()-1)>s.get(s.size()-1)) f.add(nums[i]);
            else s.add(nums[i]);
        }
        f.addAll(s);

        int[] result = new int[f.size()];
        for (int i = 0; i < f.size(); i++) {
            result[i] = f.get(i);
        }
        return result;
    }
}