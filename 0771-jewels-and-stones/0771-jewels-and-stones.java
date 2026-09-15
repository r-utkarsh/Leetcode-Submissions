class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(var i:stones.toCharArray()){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        int cnt=0;
        for(var i : jewels.toCharArray()){
            if(mp.containsKey(i)) cnt += mp.get(i);
        }
        return cnt;
    }
}