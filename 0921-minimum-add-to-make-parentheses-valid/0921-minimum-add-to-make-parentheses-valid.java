class Solution {
    public int minAddToMakeValid(String s) {
        List<Character> lst = new ArrayList<>();
        for(var i:s.toCharArray()){
            if(lst.isEmpty()) lst.add(i);
            else if(lst.get(lst.size()-1)=='(' && i==')') lst.remove(lst.size()-1);
            else lst.add(i);
        }
        return lst.size();
    }
}