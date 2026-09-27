class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(var i:candies){
            max = Math.max(i, max);
        }
        ArrayList<Boolean> list = new ArrayList<>(candies.length);

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max) list.add(true);
            else list.add(false);

        }

        return list;    
    }
}