class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int arr[] = new int[2];
        int j=0;
        for(var i: nums){
            if(!hs.add(i)) {
                arr[j]=i;
                j++;
            }
        }
        return arr;

    }
}