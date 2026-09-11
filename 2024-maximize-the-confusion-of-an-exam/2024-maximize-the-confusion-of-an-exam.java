class Solution {
    public int maxConsecutiveAnswers(String ak, int k) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int maxf=0, max=0, l=0;

        for(int r=0;r<ak.length();r++){
            char rightChar = ak.charAt(r);
            mp.put(rightChar, mp.getOrDefault(rightChar, 0)+1);
            maxf = Math.max(maxf, mp.get(rightChar));
            while((r-l+1)-maxf>k){
                char leftChar = ak.charAt(l);
                mp.put(leftChar, mp.get(leftChar)-1);
                l++;
            }
            max = Math.max(r-l+1, max);
        }
        return max;
        
    }
}