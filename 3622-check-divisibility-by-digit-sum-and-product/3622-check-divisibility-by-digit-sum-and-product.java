class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0, prod=1, temp=n;
        while(n!=0){
            int dig = n%10;
            sum+=dig;
            prod*=dig;
            n/=10;
        }
        int res = temp%(sum+prod);
        return res==0;

    }
}