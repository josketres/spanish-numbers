package com.josketres.spanishnumbers;

public class FirstPeriodFormat {

    private static final String[] UNIT = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    private static final String[] TENS = {"diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
    private static final String[] CENTS = {"ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
    private static final String[] TWO_DIGITS_CARDINAL_11_TO_29 = {"once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
    private static final String[] TWENTIES = {"veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve"};

    private final int units;
    private final int tens;
    private final int cents;
    private final int periodSize;

    public FirstPeriodFormat(long number, int periodSize) {
        this.periodSize = periodSize;

        units = (int) number % 10;
        tens = (int) (number / 10) % 10;
        cents = (int) (number / 100) % 10;
    }

    public String format() {
        return formatCents() + formatTens() + formatUnits();
    }

    private String formatCents() {

        if (cents == 0) {
            return "";
        } else if (cents == 1 && tens == 0 && units == 0) {
            return "cien";
        } else {
            return CENTS[cents - 1] + ((tens != 0 || units != 0) ? " " : "");
        }
    }

    private String formatTens() {

        if (tens == 0) {
            return "";
        } else if (units == 0) {
            return TENS[tens - 1];
        } else if (tens == 1) {
            return TWO_DIGITS_CARDINAL_11_TO_29[units - 1];
        } else if (tens == 2) {
            return TWENTIES[units - 1];
        } else {
            return TENS[tens - 1] + " y ";
        }
    }

    private String formatUnits() {

        if (tens == 1 || tens == 2) {
            return "";
        } else if ((tens != 0 || cents != 0) && units == 0) {
            return "";
        } else if (periodSize > 1 && units == 0) {
            return "";
        } else {
            return UNIT[units];
        }
    }
}
