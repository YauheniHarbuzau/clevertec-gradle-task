package ru.clevertec.utils;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {

    public static boolean isPositiveNumber(String str) {
        return StringUtils.isNumeric(str);
    }
}
