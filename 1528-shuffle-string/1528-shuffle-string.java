class Solution {
    public String restoreString(String s, int[] ind) {
        char c[] = new char[ind.length];
        for(int i=0;i<ind.length;i++){
            c[ind[i]] = s.charAt(i);
        }
        return new String(c);
    }
}

// newstring k ind[i] place p s[i] hai
