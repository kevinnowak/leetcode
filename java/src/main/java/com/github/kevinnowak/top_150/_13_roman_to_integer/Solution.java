package com.github.kevinnowak.top_150._13_roman_to_integer;

import java.util.Map;

class Solution {

    Map<String, Integer> romanToIntMap = Map.ofEntries(
            Map.entry("I", 1),
            Map.entry("V", 5),
            Map.entry("X", 10),
            Map.entry("L", 50),
            Map.entry("C", 100),
            Map.entry("D", 500),
            Map.entry("M", 1_000),
            Map.entry("IV", 4),
            Map.entry("IX", 9),
            Map.entry("XL", 40),
            Map.entry("XC", 90),
            Map.entry("CD", 400),
            Map.entry("CM", 900)
    );

    /**
     * @param s String of a roman number
     * @return The integer representation of the roman number.
     * @Constraints: 1 <= s.length <= 15 |
     * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M') |
     * It is guaranteed that s is a valid roman numeral in the range [1, 3999]
     */
    public int romanToInt(String s) {
        if (s.isBlank()) {
            return 0;
        }

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char firstCharacter = s.charAt(i);
            char secondCharacter = '\u0000';

            if (i < (s.length() - 1)) {
                secondCharacter = s.charAt(i + 1);
            }

            if (secondCharacter != '\u0000' && romanToIntMap.containsKey(firstCharacter + String.valueOf(secondCharacter))) {
                result += romanToIntMap.get(firstCharacter + String.valueOf(secondCharacter));
                i++;
            } else {
                result += romanToIntMap.get(String.valueOf(firstCharacter));
            }

        }

        return result;
    }

    private static boolean isSubstractionCase(char firstCharacter, char secondCharacter) {
        return isSubstractionPossible(firstCharacter) && checkSubstraction(firstCharacter, secondCharacter);
    }

    private static boolean isSubstractionPossible(char character) {
        return switch (character) {
            case 'I', 'X', 'C' -> true;
            default -> false;
        };
    }

    private static boolean checkSubstraction(char firstCharacter, char secondCharacter) {
        return switch (firstCharacter) {
            case 'I' -> secondCharacter == 'V' || secondCharacter == 'X';
            case 'X' -> secondCharacter == 'L' || secondCharacter == 'C';
            case 'C' -> secondCharacter == 'D' || secondCharacter == 'M';
            default -> false;
        };
    }

    private static int getIntForRomanCharacter(char character) {
        return switch (character) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1_000;
            default -> 0;
        };
    }

//    public int romanToInt(String s) {
//        if (s.isBlank()) {
//            return 0;
//        }
//
//        int result = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char firstCharacter = s.charAt(i);
//            char secondCharacter = '\u0000';
//
//            if (i < (s.length() - 1)) {
//                secondCharacter = s.charAt(i + 1);
//            }
//
//            if (secondCharacter != '\u0000' && isSubstractionCase(firstCharacter, secondCharacter)) {
//                result += getIntForRomanCharacter(secondCharacter) - getIntForRomanCharacter(firstCharacter);
//                i++;
//            } else {
//                result += getIntForRomanCharacter(firstCharacter);
//            }
//
//        }
//
//        return result;
//    }
}
