package com.github.kevinnowak.top_150._27_remove_element;

class Solution {

    int removeElement(int[] nums, int val) {
        int counter = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (nums[j] == val) {
                    counter++;
                    nums[j] = nums[i];
                    nums[i] = val;

                    break;
                }
            }
        }

        return nums.length - counter;
    }
}
