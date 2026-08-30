class Solution {
    static final long mod = 1_000_000_007l;
    public int sumDecoded(long[] nums) {

        long sum = 0;
        for(int i=0;i<nums.length; i++){
            long w,d,x,y;
            w = nums[i] % 10;
            d = (long)Math.floor(nums[i]/10);
            long dlen = String.valueOf(Math.abs(d)).length();

            x = d /(long)Math.pow(10, (dlen-w));
            y = d % (long)Math.pow(10, (dlen-w));
            sum += power(x,y);
            System.out.println(w+" "+d+" "+x+" "+y);
            System.out.println(sum);
            
        }
        return (int)(sum % mod);
    }
    static long power (long x, long y){
        long res=1;
        while(y>0){
            if(y%2==1){
                res = (res * x) % mod;
            }
            y/=2;
            x = x*x % mod;
        }
        return res;
    }
}

// x is decimal after
// y is decimal before
// x^y add krni then mod wiht 1000000007;
// w = no of dig in x rest in y