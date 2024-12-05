#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ${ClassName}Test {

    @Test
    void test${FunctionName}() {
        // Arrange
        ${ClassName} solution = new ${ClassName}();

        // TODO: Initialize input variables

        // Act
        var result = solution.${FunctionName}(/* input variables */);

        // Assert
        // TODO: Add assertions
        fail("Test not implemented");
    }
}
