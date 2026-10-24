class Solution {
    public int countMagicalPairs(String s) {
        int n=s.length(), ans=0;
    
        for(int i=0;i<n-1;i++){
            int lf[] = new int[27];
            int rf[] = new int[27];
            int fr[] = new int [26];
            int dist = 0;
            for(int j=i;j>=0;j--){
                int c = s.charAt(j)-'a';
                if(fr[c]==0) dist++;
                fr[c]++;
                lf[dist]++;
            }

            fr = new int[26];

            dist = 0;
            for(int k=i+1;k<n;k++){
                int c = s.charAt(k)-'a';
                if(fr[c] == 0) dist++;
                fr[c]++;
                rf[dist]++;
            }

            for(int l=1;l<=26; l++){
                ans+= lf[l]*rf[l];
            }
        }
        return ans;
    }
    
}