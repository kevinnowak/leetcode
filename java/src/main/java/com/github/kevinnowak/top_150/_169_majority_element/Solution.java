package com.github.kevinnowak.top_150._169_majority_element;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {

    int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        return nums[n/2];
    }

//
//    int majorityElement(int[] nums) {
//        int count = 0;
//        Integer candidate = null;
//
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;
//            }
//
//            count += (num == candidate) ? 1 : -1;
//        }
//
//        return candidate;
//    }

// Initial solution, works, but shitty performance
//    int majorityElement(int[] nums) {
//        var map = Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()
//                ));
//
//        int keyWithHighestCount = 0;
//        int highestCount = 0;
//
//        for (var entrySet : map.entrySet()) {
//            if (entrySet.getValue() > highestCount) {
//                highestCount = Math.toIntExact(entrySet.getValue());
//                keyWithHighestCount = entrySet.getKey();
//            }
//        }
//
//        return keyWithHighestCount;
//    }
}
