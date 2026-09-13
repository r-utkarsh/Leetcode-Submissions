class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> hs = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        // System.out.println(lst);
        int cnt = 0;
        for(int i=0; i<k; i++){
            if(hs.contains(s.charAt(i))) cnt++;
        }
        int l=0, r=k, max = cnt;
        while(r<s.length()){
            char leftChar = s.charAt(l);
            if(hs.contains(leftChar)) cnt--;
            char rightChar = s.charAt(r);
            if(hs.contains(rightChar)) cnt++;
            max = Math.max(cnt, max);
            l++;
            r++;
        }
        return max;

    }
}