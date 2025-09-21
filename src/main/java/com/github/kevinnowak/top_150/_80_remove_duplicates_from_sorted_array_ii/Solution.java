package com.github.kevinnowak.top_150._80_remove_duplicates_from_sorted_array_ii;

class Solution {

    int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
