#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test${FunctionName}() {
        // Given
        Solution solution = new Solution();

        // When
        var result = solution.${FunctionName}(/* input variables */);

        // Then
        fail("Test not implemented");
    }
}