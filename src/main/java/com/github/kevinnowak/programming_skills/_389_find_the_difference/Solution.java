package com.github.kevinnowak.programming_skills._389_find_the_difference;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {

    char findTheDifference(String s, String t) {
        char result = 0;

        for (char ch : s.toCharArray()) {
            result ^= ch;
        }

        for (char ch : t.toCharArray()) {
            result ^= ch;
        }

        return result;
    }

// First solution, a little bit of shitty performance
//    char findTheDifference(String s, String t) {
//        var sMap = s.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()
//                ));
//
//        var tMap = t.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()
//                ));
//
//        for (var tEntry : tMap.entrySet()) {
//            var tKey = tEntry.getKey();
//            var tValue = tEntry.getValue();
//
//            if (!sMap.containsKey(tKey) || !sMap.get(tKey).equals(tValue)) {
//                return tKey;
//            }
//        }
//
//        return 1;
//    }

// Second solution with, straight forward, alright performance
//    char findTheDifference(String s, String t) {
//        var sChars = s.toCharArray();
//        var tChars = t.toCharArray();
//
//        Arrays.sort(sChars);
//        Arrays.sort(tChars);
//
//        for (int i = 0; i < sChars.length; i++) {
//            if (sChars[i] != tChars[i]) {
//                return tChars[i];
//            }
//        }
//
//        return tChars[tChars.length - 1];
//    }
}
