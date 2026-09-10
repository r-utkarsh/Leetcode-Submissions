class Solution {
    public int longestOnes(int[] arr, int k) {
        int l=0,r=0,len=0,ml=0,fz,temp=k;
        while(r<arr.length){
            if(arr[r]==1){ 
                len++;
                r++;
            } 
            else if(arr[r]==0 && temp>0){
                len++;
                temp--;
                r++;
            }

            else if(temp==0 && arr[l]!=0){
                l++;
                len--;
            }
            else if(arr[l]==0 && temp==0){
                l++;
                temp++;
                len--;
            }

            ml = Math.max(ml,len);
        } 
        return ml;
    }
}
