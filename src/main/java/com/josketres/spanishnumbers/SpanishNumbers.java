package com.josketres.spanishnumbers;

public class SpanishNumbers {

    public static String cardinal(long number) {

        DigitList digitList = new DigitList(number);
        int periodSize = digitList.getPeriodSize();
        return (secondPeriod(digitList.periods[1]) +
                firstPeriod(digitList.periods[0], periodSize)).trim();
    }

    private static String secondPeriod(long number) {
        return new SecondPeriodFormat(number).format();
    }

    private static String firstPeriod(long number, int periodSize) {

        return new FirstPeriodFormat(number, periodSize).format();
    }
}
