package com.github.kevinnowak.top_150._88_merge_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testmerge() {
        // Given
        Solution solution = new Solution();

        var testArray1A = new int[]{1, 2, 3, 0, 0, 0};
        var testArray1B = new int[]{2, 5, 6};
        var len1A = testArray1A.length - testArray1B.length;
        var len1B = testArray1B.length;

        var testArray2A = new int[]{1};
        var testArray2B = new int[]{};
        var len2A = testArray2A.length - testArray2B.length;
        var len2B = testArray2B.length;

        var testArray3A = new int[]{0};
        var testArray3B = new int[]{1};
        var len3A = testArray3A.length - testArray3B.length;
        var len3B = testArray3B.length;

        var testArray4A = new int[]{6, 9, 14, 17, 20, 0, 0, 0};
        var testArray4B = new int[]{2, 15, 16};
        var len4A = testArray4A.length - testArray4B.length;
        var len4B = testArray4B.length;

        // When
        solution.merge(testArray1A, len1A, testArray1B, len1B);
        solution.merge(testArray2A, len2A, testArray2B, len2B);
        solution.merge(testArray3A, len3A, testArray3B, len3B);
        solution.merge(testArray4A, len4A, testArray4B, len4B);
        // Then
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, testArray1A);
        assertArrayEquals(new int[]{1}, testArray2A);
        assertArrayEquals(new int[]{1}, testArray3A);
        assertArrayEquals(new int[]{2, 6, 9, 14, 15, 16, 17, 20}, testArray4A);
    }
}
