package ru.clevertec.core;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilTest {

    @Nested
    class IsAllPositiveNumbersTest {
        @Test
        void checkIsAllPositiveNumbersShouldReturnTrue() {
            assertTrue(Util.isAllPositiveNumbers("0", "1", "1000"));
        }

        @Test
        void checkIsAllPositiveNumbersShouldReturnFalse() {
            assertAll(
                    () -> assertFalse(Util.isAllPositiveNumbers("")),
                    () -> assertFalse(Util.isAllPositiveNumbers("A")),
                    () -> assertFalse(Util.isAllPositiveNumbers("-1")),
                    () -> assertFalse(Util.isAllPositiveNumbers("-1", "0", "1"))
            );
        }
    }
}
