class Solution {
    public int countOperations(int nums1, int nums2) {
        int res = 0;
        int a = Math.max(nums1, nums2);
        for (int i = 0; i < a; i++) {
            if (nums1 == 0 || nums2 == 0) {
                break;
            }
            if (nums1 >= nums2) {
                int d = nums1 - nums2;
                res++;
                nums1 = nums2;
                nums2 = d;

            } else {
                int d = nums2 - nums1;
                res++;
                nums2 = nums1;
                nums1 = d;
            }
        }
        System.out.println(res);
        return res;
        
    }
}