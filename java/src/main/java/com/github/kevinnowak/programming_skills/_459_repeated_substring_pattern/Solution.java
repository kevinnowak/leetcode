package com.github.kevinnowak.programming_skills._459_repeated_substring_pattern;

class Solution {

    boolean repeatedSubstringPattern(String s) {
        if (s.length() < 2) {
            return false;
        }

        var substringSize = s.length() / 2;

        while (substringSize > 0) {
            var substring = s.substring(0, substringSize);
            var repeat = s.length() / substringSize;

            var check = substring.repeat(repeat);

            if (s.equals(check)) {
                return true;
            } else {
                substringSize--;
            }
        }

        return false;
    }
}
