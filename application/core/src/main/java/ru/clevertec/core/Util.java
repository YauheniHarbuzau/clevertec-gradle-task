package ru.clevertec.core;

import ru.clevertec.utils.StringUtil;

import java.util.Arrays;

public class Util {

    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(StringUtil::isPositiveNumber);
    }
}
