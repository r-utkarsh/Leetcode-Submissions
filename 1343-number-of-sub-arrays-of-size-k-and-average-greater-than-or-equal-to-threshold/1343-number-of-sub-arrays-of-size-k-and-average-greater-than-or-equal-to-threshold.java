class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int sum=0, cnt=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(Math.floor(sum/k)>=t) cnt++;
        int l=0, r=k;
        while(r<arr.length){
            sum-=arr[l];
            l++;
            sum+=arr[r];
            if(Math.floor(sum/k)>=t) cnt++;
            r++;
        }
        return cnt;
    }
}