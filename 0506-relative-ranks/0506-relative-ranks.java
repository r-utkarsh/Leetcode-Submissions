class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<score.length;i++){
            mp.put(score[i],i);
        }
        // System.out.println(mp);
        Arrays.sort(score);
        String[] ar = new String[n];
        for(int i=0;i<n;i++){
            int idx = mp.get(score[i]);
            if(i==n-1) ar[idx] = "Gold Medal";
            else if(i==n-2) ar[idx] = "Silver Medal";
            else if(i==n-3) ar[idx] = "Bronze Medal";
            else ar[idx] = String.valueOf(n-i);
        }
        
        return ar;
    }
}


// score me ulta iterate kro, score me se numver nikalo get key map mekro, then us index p change lao string array me