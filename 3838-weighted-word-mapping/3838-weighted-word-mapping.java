class Solution {
    public String mapWordWeights(String[] words, int[] wts) {
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<words.length){
            int sum=0;
            for(int j=0;j<words[i].length();j++){
                sum += wts[words[i].charAt(j)-'a'];
            }
            int dig = 25-(sum%26);
            char ch = (char)(dig+'a');
            sb.append(ch);
            i++;
        }
        return sb.toString();
    }
}