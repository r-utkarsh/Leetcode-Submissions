class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++){
            
            for(int j=0;j<nums2.length;j++){
                int cnt=0, idx = i;
                if(nums1[i] == nums2[j]){

                    for(int k=j;k<nums2.length;k++){

                        if(idx<nums1.length && nums1[idx] == nums2[k]) {
                            cnt++;
                            idx++;
                        }
                        else break;
                    }
                }
                max = Math.max(cnt, max);
            }
        }
        return max;
    }
}

// get element from 1 search it in 2 then run loop and check if the ele after 1 are equal to 2 if yes cnt++