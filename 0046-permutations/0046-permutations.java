class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> st = new ArrayList<>();
        help(lst, nums, st);
        return lst;
    }
    public static void help(List<List<Integer>> lst,int nums[], List<Integer> st){
        if(st.size()==nums.length){
            lst.add(new ArrayList<>(st));
            return;
        }
        // st.add(nums[i]);
        // help(lst, i+1, nums, st);
        // st.remove(st.size()-1);
        // help(lst)
        for(int i=0;i<nums.length;i++){
            if(!st.contains(nums[i])) {
                st.add(nums[i]);
                help(lst, nums, st);
                st.remove(st.size()-1);
            }
        }
    }
}