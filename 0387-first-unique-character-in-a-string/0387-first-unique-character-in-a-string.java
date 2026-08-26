class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
        for(var i: s.toCharArray()){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        ArrayList<Character> lst= new ArrayList<>();
        for(var key : mp.keySet()){
            if(mp.get(key)==1) lst.add(key);
        }
        System.out.println(lst);
        for(int i=0;i<s.length();i++){
            if(lst.contains(s.charAt(i))) return i;
        }
        return -1;
    }
}