class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(var i:s.toCharArray()){
            sb.append(i-'a'+1);
        }
        int sum=0;
        String ss = sb.toString();
        while(k>0){
            for(var i:ss.toCharArray()){
                sum+= i-'0';
            }
            ss = String.valueOf(sum);
            k--;
            if(k==0) return sum;
            else sum=0;
        }
        return sum;
    }
}