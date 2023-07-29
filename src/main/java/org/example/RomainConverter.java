package org.example;

public class RomainConverter {

    private static final int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] SYMBOLS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public String toRomanNumerals(int number) {

        if (number < 1) {
            throw new IllegalArgumentException("Number too small");
        } else if (number > 3000) {
            throw new IllegalArgumentException("Number too big");
        } else {
            StringBuilder romainNumber = new StringBuilder();
            convertToRoman(number, romainNumber);
            return romainNumber.toString();

        }
    }

    public void convertToRoman(int number, StringBuilder romainNumber) {
        if (number == 0) {
            return;
        } else {
            for (int i = 0; i < VALUES.length; i++) {
                if (number >= VALUES[i]) {
                    romainNumber.append(SYMBOLS[i]);
                    convertToRoman(number - VALUES[i], romainNumber);
                    return;
                }

            }
        }

    }
}
