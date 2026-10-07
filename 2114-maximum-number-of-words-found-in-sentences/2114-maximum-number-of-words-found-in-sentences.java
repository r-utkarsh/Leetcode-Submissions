class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(var i:sentences){
            int cnt=0;
            for(int j=0;j<i.length();j++){
                if(i.charAt(j)==' ')cnt++;
            }
            max = Math.max(max, cnt+1);
        }
        return max;
    }
}