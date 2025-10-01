package com.github.kevinnowak.programming_skills._242_valid_anagram;

import java.util.Arrays;

class Solution {

    boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

//    boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        var sArr = s.toCharArray();
//        var tArr = t.toCharArray();
//
//        Arrays.sort(sArr);
//        Arrays.sort(tArr);
//
//        return Arrays.equals(sArr, tArr);
//    }
}
