class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> mps = new HashMap<>();
        HashMap<Character, Integer> mpt = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mps.put(s.charAt(i),i);
        }
        for(int i=0;i<t.length();i++){
            mpt.put(t.charAt(i),i);
        }
        int sum=0;
        for(var i:s.toCharArray()){
            sum+=Math.abs(mps.get(i)-mpt.get(i));
        }
        return sum;
    }
}