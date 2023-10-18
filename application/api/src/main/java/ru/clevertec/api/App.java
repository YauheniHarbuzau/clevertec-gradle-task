package ru.clevertec.api;

import ru.clevertec.core.Util;

public class App {

    public static void main(String[] args) {
        System.out.println(getResult("12", "79"));
        System.out.println(getResult("12", "-79"));
    }

    public static String getResult(String... str) {
        return "All numbers (" +
                String.join(", ", str) +
                ") are positive - " +
                Util.isAllPositiveNumbers(str);
    }
}
