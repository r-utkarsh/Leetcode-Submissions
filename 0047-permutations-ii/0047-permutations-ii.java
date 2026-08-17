class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        Arrays.sort(nums);
        help(lst, new ArrayList<>(), used, nums);
        return lst;
    }
    static void help(List<List<Integer>> lst, List<Integer> st, boolean[] used, int nums[]){
        if(st.size()==nums.length){
            lst.add(new ArrayList<>(st));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]){
                continue;
            }
            st.add(nums[i]);
            used[i]=true;
            help(lst, st, used, nums);
            used[i]=false;
            st.remove(st.size()-1);
        }
    }
}