class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        int f[] = new int[10];

        int temp = n;
        while(temp!=0){
            int rem = temp%10;
            f[rem]++;
            temp/=10;
        }
        // System.out.println(mp);
        for(int i=0;i<f.length;i++){
            sum+=(i*f[i]);
        }
        return sum;
    }
}