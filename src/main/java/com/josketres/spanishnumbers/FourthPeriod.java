package com.josketres.spanishnumbers;

class FourthPeriod {
    private final long number;

    public FourthPeriod(long number) {
        this.number = number;
    }

    public String format() {

        return new SecondPeriod(number).format();
    }
}
