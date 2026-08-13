class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lst = new ArrayList<>();
        help(lst, new ArrayList<>(), k, n, 1);
        return lst;
    }
    static void help(List<List<Integer>> lst, List<Integer> st, int k, int n, int num){
        if(st.size()==k){
            lst.add(new ArrayList<>(st));
            return;
        }
        for(int i=num;i<=n;i++){
            st.add(i);
            help(lst, st, k, n, i+1);
            st.remove(st.size()-1);
        }
    }
}