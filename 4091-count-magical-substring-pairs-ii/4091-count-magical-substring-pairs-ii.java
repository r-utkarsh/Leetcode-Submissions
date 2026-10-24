class Solution {
    public long countMagicalPairs(String s) {
        int n = s.length();
        int[][] l = new int[n][27];
        int ls[] = new int[26];
        Arrays.fill(ls, -1);
        int posit[] = new int[26];
        for(int i=0;i<n;i++){
            ls[s.charAt(i)-'a'] = i;
            int cnt=0;
            for(int j=0;j<26;j++){
                if(ls[j]!=-1){
                    posit[cnt++] = ls[j];
                }
            }
        
            Arrays.sort(posit, 0, cnt);
            for(int idx = cnt-1;idx>=0;idx--){
                int x = cnt-idx;
                int prevPosit = (idx>0) ? posit[idx-1] : -1;
                l[i][x] = posit[idx] - prevPosit;
            }
        }

        String sb = s;
        int seen[] = new int[26];
        Arrays.fill(seen, n);
        long res  =0;
        for(int i=n-1;i>=1;i--){
            seen[sb.charAt(i)-'a'] = i;
            int cnt = 0;
            for(int j=0;j<26;j++){
                if(seen[j]!=n){
                    posit[cnt++] = seen[j];
                }
            }
            Arrays.sort(posit, 0, cnt);
            for(int idx =0;idx<cnt;idx++){
                int x = idx+1;
                int nesPosit = (idx+1<cnt) ? posit[idx+1] : n;
                int rightcnt = nesPosit-posit[idx];
                res +=(long) l[i-1][x]*rightcnt;
            }
        }
        return res;
    }
}