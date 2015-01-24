package com.josketres.spanishnumbers;

public class SpanishNumbers {

    /**
     * Return the cardinal name of the given number in spanish.
     */
    public static String cardinal(long number) {

        DigitList context = new DigitList(number);

        return (new SixthPeriod(context.periods[5]).format() +
                new FifthPeriod(context.periods[4], context.periodSize).format() +
                new FourthPeriod(context.periods[3]).format() +
                new ThirdPeriod(context.periods[2], context).format() +
                new SecondPeriod(context.periods[1]).format() +
                new FirstPeriod(context.periods[0], context.periodSize).format()).trim();
    }

}
