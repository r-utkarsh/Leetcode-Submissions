class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(var i:nums){
            String s = String.valueOf(i);
            int sum=0;
            for(var j:s.toCharArray()){
                sum+=(j-'0');
            }
            min = Math.min(sum, min);
        }
        return min;
    }
}