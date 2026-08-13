class Solution {
    public List<List<Integer>> combinationSum(int[] cd, int tar) {
        List<List<Integer>> lst  = new ArrayList<>();
        help(lst, new ArrayList<>(), cd, tar, 0, 0);
        return lst;
    }
    public static void help(List<List<Integer>> lst, List<Integer> st, int cd[], int tar, int sum, int idx){
        if(sum==tar){
            lst.add(new ArrayList<>(st));
            return;
        }
        if(sum>tar || idx==cd.length){
            return;
        }
        
        st.add(cd[idx]);
        help(lst, st, cd, tar, sum+cd[idx], idx);
        st.remove(st.size()-1);
        help(lst, st, cd, tar, sum, idx+1);
    }
}