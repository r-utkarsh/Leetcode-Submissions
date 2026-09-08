class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()) return new ArrayList<>();
        int n = p.length();
        List<Integer> lst = new ArrayList<>();
        HashMap<Character, Integer> mp = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();
        for(var i : p.toCharArray()){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        int l=0, r=n-1;
        for(int i=0;i<n;i++){
            mp2.put(s.charAt(i), mp2.getOrDefault(s.charAt(i), 0)+1);
        }
        if(mp.equals(mp2)) lst.add(l);

        while(r<s.length()-1){
            char leftChar = s.charAt(l);
            if(mp2.get(leftChar)==1) mp2.remove(leftChar);
            else mp2.put(leftChar, mp2.get(leftChar)-1);
            l++;
            r++;
            char rightChar = s.charAt(r);
            mp2.put(rightChar, mp2.getOrDefault(rightChar, 0)+1);
            if(mp.equals(mp2)) lst.add(l);
        }
        return lst;

    }
}