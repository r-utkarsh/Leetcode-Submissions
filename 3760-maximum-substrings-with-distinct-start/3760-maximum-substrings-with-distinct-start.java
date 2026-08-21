class Solution {
    public int maxDistinct(String s) {
        int cnt=0;
        HashSet<Character> hs = new HashSet<>();
        for ( var i:s.toCharArray()){
            if(!hs.contains(i)){
                hs.add(i);
                cnt++;
            }

            
        }
        return cnt;
    }
}