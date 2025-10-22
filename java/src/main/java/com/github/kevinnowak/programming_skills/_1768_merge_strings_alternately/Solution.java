package com.github.kevinnowak.programming_skills._1768_merge_strings_alternately;

class Solution {

    String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word1.length() + word2.length(); i++) {
            if (i >= word1.length() && i >= word2.length()) {
                break;
            }

            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }


        return sb.toString();
    }
}
