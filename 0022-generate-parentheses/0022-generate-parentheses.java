class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        help(sb,lst,n);
        return lst;
    }
    public static void help(StringBuilder sb, List<String> lst, int n){
        if(sb.length()==2*n){
            String s = sb.toString();
            if(isValid(s))lst.add(s);
            return;
        }
        sb.append('(');
        help(sb, lst, n);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        help(sb, lst, n);
        sb.deleteCharAt(sb.length()-1);

    }
    public static boolean isValid(String s){
        int cnt=0;
        for(var i:s.toCharArray()){
            if(i=='(') cnt++;
            else cnt--;
            if(cnt<0) return false;
        }
        return cnt==0;
    }
}