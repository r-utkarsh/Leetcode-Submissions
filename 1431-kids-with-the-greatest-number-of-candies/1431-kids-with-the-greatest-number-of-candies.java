class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(var i:candies){
            max = Math.max(i, max);
        }
        boolean ar[] = new boolean[candies.length];
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max) ar[i] = true;
            else ar[i]=false;

        }
        ArrayList<Boolean> list = new ArrayList<>(ar.length);
        for (var b : ar) {
            list.add(b); 
        }
        return list;    
    }
}