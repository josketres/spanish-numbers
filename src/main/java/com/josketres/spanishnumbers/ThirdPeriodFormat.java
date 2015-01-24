package com.josketres.spanishnumbers;

public class ThirdPeriodFormat {
    private final long number;
    private final int periodSize;

    public ThirdPeriodFormat(long number, int periodSize) {
        this.number = number;
        this.periodSize = periodSize;
    }

    public String format() {
        if (number == 0 && periodSize > 3) {
            return "millones ";
        } else if (number == 0) {
            return "";
        } else if (number == 1) {
            return "un millón ";
        } else {
            return new FirstPeriodFormat(number, 1).format() + " millones ";
        }
    }
}
