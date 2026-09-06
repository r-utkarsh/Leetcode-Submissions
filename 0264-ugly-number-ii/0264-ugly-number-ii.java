class Solution {
    public int nthUglyNumber(int n) {
        int arr[]= new int[n+1];
        int i2=1,i3=1,i5=1;
        arr[1]=1;
        for(int i=2; i<=n; i++){
            int two = arr[i2]*2;
            int three = arr[i3]*3;
            int five = arr[i5]*5;
            
            int min = Math.min(two, Math.min(three, five));

            if(two == min) i2++;
            if(three == min) i3++;
            if(five == min) i5++;

            arr[i] = min;


        }
        return arr[n];
    }
}