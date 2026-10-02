class Solution {
    public boolean isValid(String s) {
        if(s.length()==1)return false;
        Stack<Integer> st = new Stack<>();
        char cc[] = s.toCharArray();
        for(int i=0;i<cc.length;i++){
            char ch = cc[i];
            if(st.isEmpty()) st.push(i);
            else if((cc[st.peek()]=='(' && ch==')') || (cc[st.peek()]=='{' && ch=='}') || (cc[st.peek()]=='[' && ch==']')){
                st.pop();
            }
            else st.push(i);
        }
        return st.isEmpty();
    }
}

