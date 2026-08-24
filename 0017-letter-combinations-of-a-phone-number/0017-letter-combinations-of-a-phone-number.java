class Solution {
    public List<String> letterCombinations(String dig) {
        List<String> st = new ArrayList<>();
        String mapping[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(dig, mapping, st, 0, new StringBuilder());
        return st;
    }
    static void solve(String dig, String[] mapping, List<String> st, int idx, StringBuilder sb){
        if(sb.length()==dig.length()){
            st.add(new StringBuilder(sb).toString());
            return;
        }
        int num = dig.charAt(idx)-'0';
        for(int i=0;i<mapping[num].length();i++){
            char ch = mapping[num].charAt(i);
            sb.append(ch);
            solve(dig, mapping, st, idx+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}