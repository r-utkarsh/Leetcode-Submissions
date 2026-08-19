class Solution {
    public int[] findErrorNums(int[] nums) {
        int mis = 0, twc = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if(hs.contains(num)) twc = num;
            hs.add(num);
        }
        
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)) mis = i;
        }
        // System.out.println(mis);
        // System.out.println(twc);
        int arr[] = new int[2];
        arr[0] = twc;
        arr[1] = mis;


        return arr;
        
    }
}