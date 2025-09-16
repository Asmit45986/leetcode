class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        int m = nums1.length;
        int n = nums2.length;
        for (int i = 0; i < m; i++) {
            int max = -1;
            for (int j = 0; j < n; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j + 1; k < n; k++) {
                        if(nums1[i]<nums2[k]){
                            max = nums2[k];
                            break;
                        }
                    }
                    break;

                }

            }
            arr[i] = max;
        }
        return arr;
        
    }
}