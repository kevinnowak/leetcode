package com.github.kevinnowak.top_150._13_roman_to_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideDataForRomanToInt")
    void romanToInt(String s, int expectedResult) {
        // Given
        Solution solution = new Solution();

        // When
        var result = solution.romanToInt(s);

        // Then
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> provideDataForRomanToInt() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("I", 1),
                Arguments.of("IV", 4),
                Arguments.of("IX", 9),
                Arguments.of("VIII", 8),
                Arguments.of("XL", 40),
                Arguments.of("XLIV", 44),
                Arguments.of("XC", 90),
                Arguments.of("XCIX", 99),
                Arguments.of("CD", 400),
                Arguments.of("CDXLIV", 444),
                Arguments.of("CM", 900),
                Arguments.of("M", 1000),
                Arguments.of("MM", 2000),
                Arguments.of("MMM", 3000),
                Arguments.of("MDCLXVI", 1666)
        );
    }
}