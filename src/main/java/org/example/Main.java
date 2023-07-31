package org.example;

public class Main {
    public static void main(String[] args) {

        // New instance of RomainConverter
        RomainConverter converter = new RomainConverter();

        // convert to Roman Numerals
        int arabicNumber = converter.toArabicNumerals("LXIX");

        // print result
        System.out.println("LXIX -> " + arabicNumber);

        // convert to Arabic Numerals
        String romanNumber = converter.toRomanNumerals(69);

        // print result
        System.out.println("69 -> " + romanNumber);

    }
}