class Solution {
    public int sumCounts(List<Integer> nums) {

        int n = nums.size();
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                HashSet<Integer> hs = new HashSet<>();
                for (int k = i; k <= j; k++) {
                    hs.add(nums.get(k));
                }
                sum+= hs.size()*hs.size();
            }
        }
        return sum;
    }
}