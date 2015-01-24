package com.josketres.spanishnumbers;

public class SpanishNumbers {

    /**
     * Return the cardinal name of the given number in spanish.
     */
    public static String cardinal(long number) {

        DigitList digitList = new DigitList(number);
        int periodSize = digitList.getPeriodSize();
        return (fourthPeriod(digitList.periods[3]) +
                thirdPeriod(digitList.periods[2], periodSize) +
                secondPeriod(digitList.periods[1]) +
                firstPeriod(digitList.periods[0], periodSize)).trim();
    }

    private static String fourthPeriod(long number) {
        return new FourthPeriod(number).format();
    }

    private static String thirdPeriod(long number, int periodSize) {
        return new ThirdPeriod(number, periodSize).format();
    }

    private static String secondPeriod(long number) {
        return new SecondPeriod(number).format();
    }

    private static String firstPeriod(long number, int periodSize) {
        return new FirstPeriod(number, periodSize).format();
    }
}
