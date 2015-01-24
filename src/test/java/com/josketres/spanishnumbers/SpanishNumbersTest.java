package com.josketres.spanishnumbers;

import org.junit.Test;

import static com.josketres.spanishnumbers.SpanishNumbers.cardinal;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SpanishNumbersTest {

    @Test
    public void test_cardinal_one_digit_numbers() {

        assertThat(cardinal(0), equalTo("cero"));
        assertThat(cardinal(1), equalTo("uno"));
        assertThat(cardinal(2), equalTo("dos"));
        assertThat(cardinal(3), equalTo("tres"));
        assertThat(cardinal(4), equalTo("cuatro"));
        assertThat(cardinal(5), equalTo("cinco"));
        assertThat(cardinal(6), equalTo("seis"));
        assertThat(cardinal(7), equalTo("siete"));
        assertThat(cardinal(8), equalTo("ocho"));
        assertThat(cardinal(9), equalTo("nueve"));
    }

    @Test
    public void test_cardinal_two_digits_numbers_less_than_20() {

        assertThat(cardinal(10), equalTo("diez"));
        assertThat(cardinal(11), equalTo("once"));
        assertThat(cardinal(12), equalTo("doce"));
        assertThat(cardinal(13), equalTo("trece"));
        assertThat(cardinal(14), equalTo("catorce"));
        assertThat(cardinal(15), equalTo("quince"));
        assertThat(cardinal(16), equalTo("dieciséis"));
        assertThat(cardinal(17), equalTo("diecisiete"));
        assertThat(cardinal(18), equalTo("dieciocho"));
        assertThat(cardinal(19), equalTo("diecinueve"));
    }

    @Test
    public void test_cardinal_two_digits_numbers_greater_than_20() {

        assertThat(cardinal(20), equalTo("veinte"));
        assertThat(cardinal(21), equalTo("veintiuno"));
        assertThat(cardinal(22), equalTo("veintidós"));
        assertThat(cardinal(23), equalTo("veintitrés"));
        assertThat(cardinal(24), equalTo("veinticuatro"));
        assertThat(cardinal(25), equalTo("veinticinco"));
        assertThat(cardinal(26), equalTo("veintiséis"));
        assertThat(cardinal(27), equalTo("veintisiete"));
        assertThat(cardinal(28), equalTo("veintiocho"));
        assertThat(cardinal(29), equalTo("veintinueve"));
    }

    @Test
    public void test_cardinal_two_digits_numbers_greater_than_30() {

        assertThat(cardinal(30), equalTo("treinta"));
        assertThat(cardinal(31), equalTo("treinta y uno"));
        assertThat(cardinal(32), equalTo("treinta y dos"));
        assertThat(cardinal(33), equalTo("treinta y tres"));
        assertThat(cardinal(34), equalTo("treinta y cuatro"));
        assertThat(cardinal(35), equalTo("treinta y cinco"));
        assertThat(cardinal(36), equalTo("treinta y seis"));
        assertThat(cardinal(37), equalTo("treinta y siete"));
        assertThat(cardinal(38), equalTo("treinta y ocho"));
        assertThat(cardinal(39), equalTo("treinta y nueve"));
        assertThat(cardinal(48), equalTo("cuarenta y ocho"));
        assertThat(cardinal(99), equalTo("noventa y nueve"));
    }

    @Test
    public void test_cardinal_numbers_100_to_109() {

        assertThat(cardinal(100), equalTo("cien"));
        assertThat(cardinal(101), equalTo("ciento uno"));
        assertThat(cardinal(102), equalTo("ciento dos"));
        assertThat(cardinal(103), equalTo("ciento tres"));
        assertThat(cardinal(104), equalTo("ciento cuatro"));
        assertThat(cardinal(105), equalTo("ciento cinco"));
        assertThat(cardinal(106), equalTo("ciento seis"));
        assertThat(cardinal(107), equalTo("ciento siete"));
        assertThat(cardinal(108), equalTo("ciento ocho"));
        assertThat(cardinal(109), equalTo("ciento nueve"));
    }

    @Test
    public void test_cardinal_numbers_110_to_199() {

        assertThat(cardinal(110), equalTo("ciento diez"));
        assertThat(cardinal(111), equalTo("ciento once"));
        assertThat(cardinal(112), equalTo("ciento doce"));
        assertThat(cardinal(119), equalTo("ciento diecinueve"));
        assertThat(cardinal(120), equalTo("ciento veinte"));
        assertThat(cardinal(130), equalTo("ciento treinta"));
        assertThat(cardinal(131), equalTo("ciento treinta y uno"));
        assertThat(cardinal(150), equalTo("ciento cincuenta"));
        assertThat(cardinal(180), equalTo("ciento ochenta"));
        assertThat(cardinal(199), equalTo("ciento noventa y nueve"));
    }

    @Test
    public void test_cardinal_numbers_200_to_299() {

        assertThat(cardinal(200), equalTo("doscientos"));
        assertThat(cardinal(201), equalTo("doscientos uno"));
        assertThat(cardinal(210), equalTo("doscientos diez"));
        assertThat(cardinal(221), equalTo("doscientos veintiuno"));
        assertThat(cardinal(299), equalTo("doscientos noventa y nueve"));
    }

    @Test
    public void test_cardinal_numbers_300_to_999() {

        assertThat(cardinal(300), equalTo("trescientos"));
        assertThat(cardinal(401), equalTo("cuatrocientos uno"));
        assertThat(cardinal(510), equalTo("quinientos diez"));
        assertThat(cardinal(821), equalTo("ochocientos veintiuno"));
        assertThat(cardinal(999), equalTo("novecientos noventa y nueve"));
    }

    @Test
    public void test_cardinal_numbers_1000_to_999000() {

        assertThat(cardinal(1000), equalTo("mil"));
        assertThat(cardinal(1500), equalTo("mil quinientos"));
        assertThat(cardinal(2000), equalTo("dos mil"));
        assertThat(cardinal(2800), equalTo("dos mil ochocientos"));
        assertThat(cardinal(3000), equalTo("tres mil"));
        assertThat(cardinal(4000), equalTo("cuatro mil"));
        assertThat(cardinal(5000), equalTo("cinco mil"));
        assertThat(cardinal(6000), equalTo("seis mil"));
        assertThat(cardinal(7000), equalTo("siete mil"));
        assertThat(cardinal(8000), equalTo("ocho mil"));
        assertThat(cardinal(9000), equalTo("nueve mil"));
        assertThat(cardinal(10000), equalTo("diez mil"));
        assertThat(cardinal(15000), equalTo("quince mil"));
        assertThat(cardinal(18000), equalTo("dieciocho mil"));
        assertThat(cardinal(22000), equalTo("veintidós mil"));
        assertThat(cardinal(28000), equalTo("veintiocho mil"));
        assertThat(cardinal(37000), equalTo("treinta y siete mil"));
        assertThat(cardinal(85000), equalTo("ochenta y cinco mil"));
        assertThat(cardinal(100000), equalTo("cien mil"));
        assertThat(cardinal(108000), equalTo("ciento ocho mil"));
        assertThat(cardinal(160000), equalTo("ciento sesenta mil"));
        assertThat(cardinal(585000), equalTo("quinientos ochenta y cinco mil"));
        assertThat(cardinal(999000), equalTo("novecientos noventa y nueve mil"));
    }

    @Test
    public void test_cardinal_numbers_1_000_000_to_999_999_999() {

        assertThat(cardinal(1000000), equalTo("un millón"));
        assertThat(cardinal(2000000), equalTo("dos millones"));
        assertThat(cardinal(500000000), equalTo("quinientos millones"));
        assertThat(cardinal(999999999), equalTo("novecientos noventa y nueve millones novecientos noventa y nueve mil novecientos noventa y nueve"));
    }

    @Test
    public void test_cardinal_numbers_1000_000_000_to_999_999_999_999() {

        assertThat(cardinal(1000000000), equalTo("mil millones"));
        assertThat(cardinal(1200000000), equalTo("mil doscientos millones"));
        assertThat(cardinal(999999999999L), equalTo("novecientos noventa y nueve mil novecientos noventa y nueve millones novecientos noventa y nueve mil novecientos noventa y nueve"));
    }

    @Test
    public void test_cardinal_numbers_1_000_000_000_000_to_999_999_999_999_999() {

        assertThat(cardinal(1000000000000L), equalTo("un billón"));
        assertThat(cardinal(200000000120000L), equalTo("doscientos billones ciento veinte mil"));
        assertThat(cardinal(999999999999999L), equalTo("novecientos noventa y nueve billones novecientos noventa y nueve mil novecientos noventa y nueve millones novecientos noventa y nueve mil novecientos noventa y nueve"));
    }

    @Test
    public void test_cardinal_numbers_1_000_000_000_000_000_to_999_999_999_999_999_999() {

        assertThat(cardinal(1000000000000000L), equalTo("mil billones"));
        assertThat(cardinal(999999999999999999L), equalTo("novecientos noventa y nueve mil novecientos noventa y nueve billones novecientos noventa y nueve mil novecientos noventa y nueve millones novecientos noventa y nueve mil novecientos noventa y nueve"));
    }
}