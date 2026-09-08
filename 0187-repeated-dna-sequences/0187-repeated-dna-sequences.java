class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<10) return new ArrayList<>();
        int l=0, r=9;
        HashSet<String> hs = new HashSet<>();
        HashSet<String> ans = new HashSet<>();
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10;i++){
            sb.append(s.charAt(i));
        }
        hs.add(sb.toString());
        while(r<s.length()-1){
            sb.deleteCharAt(0);           
            r++;
            sb.append(s.charAt(r));
            if(hs.contains(sb.toString()) && ans.add(sb.toString())) res.add(sb.toString());
            else hs.add(sb.toString());
        }
        return res;
    }
}