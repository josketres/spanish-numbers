package com.josketres.spanishnumbers;

class FifthPeriod {
    private final long number;
    private final int periodSize;

    public FifthPeriod(long number, int periodSize) {
        this.periodSize = periodSize;
        this.number = number;
    }

    public String format() {
        if (number == 0 && periodSize > 5) {
            return "billones ";
        } else if (number == 0) {
            return "";
        } else if (number == 1) {
            return "un billón ";
        } else {
            return new FirstPeriod(number, 1).format() + " billones ";
        }
    }
}
