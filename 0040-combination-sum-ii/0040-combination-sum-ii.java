class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int tar) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(c);
        help(lst, new ArrayList<>(), c, tar, 0,0);
        return lst;
    }
    public static void help( List<List<Integer>> lst, List<Integer> st, int[] c, int tar, int sum, int start){
        if(sum==tar){
            lst.add(new ArrayList<>(st));
            return;
        }
        if(start==c.length || sum>tar) return;

        for(int i=start;i<c.length;i++){
            if (i > start && c[i] == c[i - 1]) {
                continue;
            }
            st.add(c[i]);
            help(lst, st, c, tar, sum+c[i], i+1);
            st.remove(st.size()-1);
        }
        
    }
}