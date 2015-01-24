package com.josketres.spanishnumbers;

public class ThirdPeriodFormat {
    private final long number;

    public ThirdPeriodFormat(long number) {
        this.number = number;
    }

    public String format() {
        if (number == 0) {
            return "";
        } else if (number == 1) {
            return "un millón ";
        } else {
            return new FirstPeriodFormat(number, 1).format() + " millones ";
        }
    }
}
