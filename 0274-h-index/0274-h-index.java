class Solution {
    public int hIndex(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n+1];
        for(var i : nums){
            if(i>n) arr[n]++;
            else arr[i]++;
        }
        int total = 0;
        for(int i=n;i>=0;i--){
            total+=arr[i];
            if(total >= i) return i;
        }
        return 0;
    }
}
