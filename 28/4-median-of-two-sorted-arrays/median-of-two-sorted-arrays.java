class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Step 1: Merge the two arrays
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        // Merge the arrays in sorted order
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }

        // Step 2: Find the median
        int totalLength = merged.length;
        if (totalLength % 2 == 1) {
            return merged[totalLength / 2];
        } else {
            return (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0;
        }
    }
}
