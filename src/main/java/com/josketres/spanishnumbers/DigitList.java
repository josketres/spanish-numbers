package com.josketres.spanishnumbers;

class DigitList {

    public static final int MAX_COUNT = 19; // == Long.toString(Long.MAX_VALUE).length()
    private static final int MAX_PERIODS = 7; // == Math.ceil(MAX_COUNT / 3)

    public final char[] digits = new char[MAX_COUNT];
    public final long[] periods = new long[MAX_PERIODS];
    public final int periodSize;

    {
        for (int i = 0; i < digits.length; i++) {
            digits[i] = '0';
        }
    }

    public DigitList(long number) {
        char[] chars = Long.toString(number).toCharArray();
        System.arraycopy(chars, 0, digits, digits.length - chars.length, chars.length);
        buildPeriods();
        periodSize = getPeriodSize();
    }

    private void buildPeriods() {
        periods[6] = Long.valueOf(String.valueOf(digits[0]));
        for (int i = 3; i < digits.length; i += 3) {
            int index = 6 - (i / 3);
            periods[index] = Long.valueOf(String.valueOf(digits[i - 2]) + String.valueOf(digits[i - 1]) + String.valueOf(digits[i]));
        }
    }

    private int getPeriodSize() {
        int size = periods.length;
        for (int i = size - 1; i >= 0; i--) {
            if (periods[i] == 0) {
                size--;
            } else {
                return size;
            }
        }
        return size;
    }
}
