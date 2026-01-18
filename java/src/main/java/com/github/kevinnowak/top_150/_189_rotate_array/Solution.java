package com.github.kevinnowak.top_150._189_rotate_array;

class Solution {

    private static void reverseFromUntil(int[] arr, int leftPtr, int rightPtr) {
        while (leftPtr < rightPtr) {
            int tmp = arr[leftPtr];
            arr[leftPtr] = arr[rightPtr];
            arr[rightPtr] = tmp;
            leftPtr++;
            rightPtr--;
        }
    }

    void rotate(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }

        k = k % nums.length;

        reverseFromUntil(nums, 0, nums.length - 1);
        reverseFromUntil(nums, 0, (k % nums.length) - 1);
        reverseFromUntil(nums, (k % nums.length), nums.length - 1);
    }
}
