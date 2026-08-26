class Solution {
    public char repeatedCharacter(String s) {
        List<Character> lst =new ArrayList<>();
        for(var i:s.toCharArray()){
            if(lst.contains(i)) return i;
            lst.add(i);
        }
        return 'a';
    }
}