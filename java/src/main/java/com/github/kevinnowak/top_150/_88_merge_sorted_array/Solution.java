package com.github.kevinnowak.top_150._88_merge_sorted_array;

class Solution {
    void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Ptr = m - 1;
        int nums2Ptr = n - 1;
        int backwardsPtr = m + n - 1;

        while (nums2Ptr >= 0) {
            if (nums1Ptr >= 0 && nums1[nums1Ptr] > nums2[nums2Ptr]) {
                nums1[backwardsPtr--] = nums1[nums1Ptr--];
            } else {
                nums1[backwardsPtr--] = nums2[nums2Ptr--];
            }
        }
    }
}
