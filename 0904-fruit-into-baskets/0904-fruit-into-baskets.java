class Solution {
    public int totalFruit(int[] f) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int max = 0, l=0, r=0;
        while( r<f.length){
            mp.put(f[r], mp.getOrDefault(f[r], 0)+1);
            while(mp.size()>2){
                if(mp.get(f[l]) == 1) mp.remove(f[l]);
                else {
                    mp.put(f[l], mp.get(f[l])-1);
                }
                l++;
            }
            max = Math.max(max, r-l+1);            
            r++;   
        }
        return max;
    }
}