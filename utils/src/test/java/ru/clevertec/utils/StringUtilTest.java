package ru.clevertec.utils;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilTest {

    @Nested
    class IsPositiveNumberTest {
        @ParameterizedTest
        @ValueSource(strings = {"0", "1", "1000"})
        void checkIsPositiveNumberShouldReturnTrue(String argument) {
            assertTrue(StringUtil.isPositiveNumber(argument));
        }

        @ParameterizedTest
        @ValueSource(strings = {"", "A", "-1", "-1000"})
        void checkIsPositiveNumberShouldReturnFalse(String argument) {
            assertFalse(StringUtil.isPositiveNumber(argument));
        }
    }
}
