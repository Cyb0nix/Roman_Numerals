package org.example;

public class RomainConverter {

    private static final int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] SYMBOLS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public String toRomanNumerals(int number) {

        if (number < 1) {
            throw new IllegalArgumentException("Number too small");
        } else if (number > 3000) {
            throw new IllegalArgumentException("Number too big");
        }

        StringBuilder romainNumber = new StringBuilder();
        convertToRoman(number, romainNumber);
        return romainNumber.toString();

    }

    private void convertToRoman(int number, StringBuilder romainNumber) {
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

    public int toArabicNumerals(String number) {

        String[] numberSplit = number.split("");

        int arabicNumber = 0;
        int previous = 0;

        for (int i = numberSplit.length - 1; i >= 0; i--) {
            int current = convertToArabic(numberSplit[i]);
            if (current < previous) {
                arabicNumber -= current;
            } else {
                arabicNumber += current;
            }
            previous = current;

            if (arabicNumber > 3000) {
                throw new IllegalArgumentException("Number too big");
            }
        }
        return arabicNumber;

    }

    private int convertToArabic(String number) {
        switch (number) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;

            default:
                throw new IllegalArgumentException("Invalide Number");
        }
    }

}
