package com.josketres.spanishnumbers;

class SixthPeriod {
    private final long number;

    public SixthPeriod(long number) {
        this.number = number;
    }

    public String format() {
        return new SecondPeriod(number).format();
    }
}
