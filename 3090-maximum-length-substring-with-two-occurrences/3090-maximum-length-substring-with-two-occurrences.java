class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;
        int l=0,r=0;
        HashMap<Character, Integer> mp = new HashMap<>();
        for(var i : s.toCharArray()){
            mp.put(i,0);
        }

        while(r<s.length()){
            char ch = s.charAt(r);
            mp.put(ch, mp.get(ch)+1);

            while(mp.get(ch)>2){
                char cleft = s.charAt(l);
                mp.put(cleft,mp.get(cleft)-1);
                l++;
            }

            max = Math.max(max, r-l+1);
            r++;
        }
        return max;
    }
}
