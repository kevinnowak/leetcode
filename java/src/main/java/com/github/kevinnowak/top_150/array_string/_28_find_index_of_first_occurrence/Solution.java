package com.github.kevinnowak.top_150.array_string._28_find_index_of_first_occurrence;

class Solution {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

//    Solution #1
//    public int strStr(String haystack, String needle) {
//        for (int i = 0; i < haystack.length(); i++) {
//            for (int j = 0; j < needle.length() && haystack.length() > i + j; j++) {
//                if (haystack.charAt(i + j) == needle.charAt(j)) {
//                    if (j == needle.length() - 1) {
//                        return i;
//                    }
//                } else {
//                    break;
//                }
//            }
//        }
//
//        return -1;
//    }

//    Solution #2
//    public int strStr(String haystack, String needle) {
//        int index = -1;
//
//        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
//            if (haystack.substring(i, i + needle.length()).equals(needle)) {
//                index = i;
//
//                break;
//            }
//        }
//
//        return index;
//    }
}
