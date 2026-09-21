class Solution {
    public int maximumWealth(int[][] acc) {
        int max =0;
        for(var i : acc){
            int sum=0;
            for(int j=0;j<i.length;j++){
                sum+=i[j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}