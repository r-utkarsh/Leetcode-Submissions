class Solution {
    public String longestCommonPrefix(String[] strs) {        
        StringBuilder sb = new StringBuilder();
        int minLen = Integer.MAX_VALUE;
        String ref = new String();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minLen) {
                ref = strs[i];
                minLen = ref.length();
            }
        }
        System.out.println(ref);
        for(int i=0;i<minLen;i++){
            char ch = ref.charAt(i);
            for(var str : strs){
                char chstr = str.charAt(i);
                if( ch != chstr ) return sb.toString();
            }
            sb.append(ch);

        }
        return sb.toString();

    }
}