package com.josketres.spanishnumbers;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SpanishNumbersTest {

    @Test
    public void test_cardinal_one_digit_numbers() {

        assertThat(SpanishNumbers.cardinal(0), equalTo("cero"));
        assertThat(SpanishNumbers.cardinal(1), equalTo("uno"));
        assertThat(SpanishNumbers.cardinal(2), equalTo("dos"));
        assertThat(SpanishNumbers.cardinal(3), equalTo("tres"));
        assertThat(SpanishNumbers.cardinal(4), equalTo("cuatro"));
        assertThat(SpanishNumbers.cardinal(5), equalTo("cinco"));
        assertThat(SpanishNumbers.cardinal(6), equalTo("seis"));
        assertThat(SpanishNumbers.cardinal(7), equalTo("siete"));
        assertThat(SpanishNumbers.cardinal(8), equalTo("ocho"));
        assertThat(SpanishNumbers.cardinal(9), equalTo("nueve"));
    }

    @Test
    public void test_cardinal_two_digits_numbers_less_than_20() {

        assertThat(SpanishNumbers.cardinal(10), equalTo("diez"));
        assertThat(SpanishNumbers.cardinal(11), equalTo("once"));
        assertThat(SpanishNumbers.cardinal(12), equalTo("doce"));
        assertThat(SpanishNumbers.cardinal(13), equalTo("trece"));
        assertThat(SpanishNumbers.cardinal(14), equalTo("catorce"));
        assertThat(SpanishNumbers.cardinal(15), equalTo("quince"));
        assertThat(SpanishNumbers.cardinal(16), equalTo("dieciséis"));
        assertThat(SpanishNumbers.cardinal(17), equalTo("diecisiete"));
        assertThat(SpanishNumbers.cardinal(18), equalTo("dieciocho"));
        assertThat(SpanishNumbers.cardinal(19), equalTo("diecinueve"));
    }

    @Test
    public void test_cardinal_two_digits_numbers_greater_than_20() {

        assertThat(SpanishNumbers.cardinal(20), equalTo("veinte"));
        assertThat(SpanishNumbers.cardinal(21), equalTo("veintiuno"));
        assertThat(SpanishNumbers.cardinal(22), equalTo("veintidós"));
        assertThat(SpanishNumbers.cardinal(23), equalTo("veintitrés"));
        assertThat(SpanishNumbers.cardinal(24), equalTo("veinticuatro"));
        assertThat(SpanishNumbers.cardinal(25), equalTo("veinticinco"));
        assertThat(SpanishNumbers.cardinal(26), equalTo("veintiséis"));
        assertThat(SpanishNumbers.cardinal(27), equalTo("veintisiete"));
        assertThat(SpanishNumbers.cardinal(28), equalTo("veintiocho"));
        assertThat(SpanishNumbers.cardinal(29), equalTo("veintinueve"));
    }

    @Test
    public void test_cardinal_two_digits_numbers_greater_than_30() {

        assertThat(SpanishNumbers.cardinal(30), equalTo("treinta"));
        assertThat(SpanishNumbers.cardinal(31), equalTo("treinta y uno"));
        assertThat(SpanishNumbers.cardinal(32), equalTo("treinta y dos"));
        assertThat(SpanishNumbers.cardinal(33), equalTo("treinta y tres"));
        assertThat(SpanishNumbers.cardinal(34), equalTo("treinta y cuatro"));
        assertThat(SpanishNumbers.cardinal(35), equalTo("treinta y cinco"));
        assertThat(SpanishNumbers.cardinal(36), equalTo("treinta y seis"));
        assertThat(SpanishNumbers.cardinal(37), equalTo("treinta y siete"));
        assertThat(SpanishNumbers.cardinal(38), equalTo("treinta y ocho"));
        assertThat(SpanishNumbers.cardinal(39), equalTo("treinta y nueve"));
        assertThat(SpanishNumbers.cardinal(48), equalTo("cuarenta y ocho"));
        assertThat(SpanishNumbers.cardinal(99), equalTo("noventa y nueve"));
    }
}