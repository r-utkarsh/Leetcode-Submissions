class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int maxv = 0,  maxc = 0;
        for(var i:s.toCharArray()){
            if(isVowel(i)){
                mp.put(i, mp.getOrDefault(i,0)+1);
                maxv = Math.max(maxv, mp.get(i));
            }
            else {
                mp.put(i, mp.getOrDefault(i,0)+1);
                maxc = Math.max(maxc, mp.get(i));
            }
        }
        return maxc+maxv;
    }
    static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
        return false;
    }
}