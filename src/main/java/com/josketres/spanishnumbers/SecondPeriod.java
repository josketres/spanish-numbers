package com.josketres.spanishnumbers;

class SecondPeriod {

    private final long number;

    public SecondPeriod(long number) {
        this.number = number;
    }

    public String format() {
        if (number == 0) {
            return "";
        } else if (number == 1) {
            return "mil ";
        } else {
            return new FirstPeriod(number, 1).format() + " mil ";
        }
    }
}
