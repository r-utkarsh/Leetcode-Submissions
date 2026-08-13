class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> lst = new ArrayList<>();
        help(lst, new ArrayList<>(), k, n, 1, 0);
        return lst;
    }
    static void help(List<List<Integer>> lst, List<Integer> st, int len, int tar, int start, int sum){
        if(sum == tar && st.size()==len){
            lst.add(new ArrayList<>(st));
            return;
        }
        if( st.size()>=len || sum>tar) return;
        
        for(int i=start;i<10;i++){
            st.add(i);
            help(lst, st, len, tar, i+1, sum+i);
            st.remove(st.size()-1);
        }
    }
}

// (sum == tar && st.size()!=len )