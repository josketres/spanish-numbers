package com.josketres.spanishnumbers;

class SecondPeriodFormat {

    private final long number;

    public SecondPeriodFormat(long number) {
        this.number = number;
    }

    public String format() {
        if (number == 0) {
            return "";
        } else if (number == 1) {
            return "mil ";
        } else {
            return new FirstPeriodFormat(number, 1).format() + " mil ";
        }
    }
}
