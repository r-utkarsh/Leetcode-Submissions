class Solution {
    public int characterReplacement(String s, int k) {
        int l=0, max = Integer.MIN_VALUE, maxf=0;
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int r=0; r<s.length(); r++){
            char ch = s.charAt(r);
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
            maxf = Math.max(mp.get(ch), maxf);
            while((r-l+1)-maxf>k){
                mp.put(s.charAt(l), mp.get(s.charAt(l))-1);
                l++;
            }
            max = Math.max(max, r-l+1);
        }
        return max;
        
    }
}
// replacements needed = window length - frequency of most frequent character