package ru.clevertec.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void checkGetResultShouldReturnCorrectString() {
        String expectedStr = "All numbers (12, 79) are positive - true";
        String actualStr = App.getResult("12", "79");
        assertEquals(expectedStr, actualStr);
    }
}
