class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        HashMap<Character, Integer> mp2 = new HashMap<>();
        for(var e: s1.toCharArray()){
            mp2.put(e, mp2.getOrDefault(e, 0)+1);
        }

        for(int i=0;i<s2.length()-s1.length()+1; i++){
            
            HashMap<Character, Integer> mp = new HashMap<>(mp2);

            for(int j=i; j<i+s1.length(); j++){
                char ch = s2.charAt(j);
                if(mp.containsKey(ch)){
                    if(mp.get(ch)==1) mp.remove(ch);
                    else mp.put(ch, mp.get(ch)-1);
                }
                else continue;
            }
            if(mp.isEmpty()) return true;
        }
        return false;
    }
}