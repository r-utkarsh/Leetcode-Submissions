class Solution {
    public int subtractProductAndSum(int n) {
        String str = String.valueOf(n);
        int sum=0,prod=1;
        for(var i:str.toCharArray()){
            sum+= i-'0';
            prod*=i-'0';
        }
        return prod-sum;
    }
}