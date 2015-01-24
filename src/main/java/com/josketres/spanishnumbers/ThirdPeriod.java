package com.josketres.spanishnumbers;

class ThirdPeriod {
    private final long number;
    private final DigitList context;

    public ThirdPeriod(long number, DigitList context) {
        this.number = number;
        this.context = context;
    }

    public String format() {
        if (number == 0 && context.periods[3] != 0) {
            return "millones ";
        } else if (number == 0) {
            return "";
        } else if (number == 1) {
            return "un millón ";
        } else {
            return new FirstPeriod(number, 1).format() + " millones ";
        }
    }
}
