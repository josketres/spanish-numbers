package com.josketres.spanishnumbers;

public class SpanishNumbers {

    public static String cardinal(long number) {

        return firstPeriod(new DigitList(number).periods[0]);
    }

    private static String firstPeriod(long number) {

        return new FirstPeriodFormat(number).format();
    }


}
