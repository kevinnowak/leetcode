package com.github.kevinnowak.top_150._26_remove_duplicates_from_sorted_array;

class Solution {

    int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
// First solution, shitty runtime
//    public int removeDuplicates(int[] nums) {
//        Set<Integer> set = new TreeSet<>();
//
//        for (int element : nums) {
//            set.add(element);
//        }
//
//        for (int i = 0; i < set.size(); i++) {
//            nums[i] = (int) set.toArray()[i];
//        }
//
//        return set.size();
//    }

// Second solution, complicated and bad runtime
//    int removeDuplicates(int[] nums) {
//        if (nums.length < 2) {
//            return 1;
//        }
//
//        int counter = 1;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            int j = i + 1;
//
//            if (nums[i] < nums[j]) {
//                counter++;
//
//            } else {
//                while (j < nums.length && nums[i] >= nums[j]) {
//                    j++;
//                }
//
//                if (j < nums.length && nums[i] != nums[j]) {
//                    nums[i + 1] = nums[j];
//                    counter++;
//                } else {
//                    return counter;
//                }
//            }
//        }
//
//        return counter;
//    }
