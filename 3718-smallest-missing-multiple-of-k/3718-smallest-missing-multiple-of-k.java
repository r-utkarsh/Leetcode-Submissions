class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> lst = new ArrayList<>();
        for(var i:nums){
            lst.add(i);
        }
        int ans = 0;
        for(int i=1;i<=200;i++){
            if(i%k==0 && !lst.contains(i)){
                ans = i;
                break;
            }

        }
        return ans;
    }

}