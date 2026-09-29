class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int arr[] = new int[nums.size()];
        int x=0;
        for(var i:nums){
            arr[x++] = i;
        }
        int cnt=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]<target) cnt++;
            }
        }
        return cnt;
    }
}