class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer>lst  = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            int idx = index[i];
            int num = nums[i];
            lst.add(idx, num);
        }
        int[] arr = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++)
            arr[i] = lst.get(i);
        return arr;
    }
}