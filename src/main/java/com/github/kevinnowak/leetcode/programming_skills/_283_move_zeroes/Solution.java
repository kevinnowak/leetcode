package com.github.kevinnowak.leetcode.programming_skills._283_move_zeroes;

class Solution {

    // Time complexity O(n^2)
    void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int ptr = i;

                while (ptr > 0 && nums[ptr - 1] == 0) {
                    nums[ptr - 1] = nums[ptr];
                    nums[ptr] = 0;
                    ptr--;
                }
            }
        }
    }

    // Time complexity O(n)
    void moveZeroesFaster(int[] nums) {
        int insertPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = tmp;
                insertPos++;
            }
        }
    }
}
