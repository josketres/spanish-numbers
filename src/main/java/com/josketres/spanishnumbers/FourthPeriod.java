package com.josketres.spanishnumbers;

public class FourthPeriod {
    private final long number;

    public FourthPeriod(long number) {
        this.number = number;
    }

    public String format() {

        return new SecondPeriodFormat(number).format();
    }
}
