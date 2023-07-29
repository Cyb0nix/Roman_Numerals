import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.RomainConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void RomainConverter() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(1);

        Assertions.assertEquals("I", value);
    }

    @Test
    public void RomainConverter2() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(2);

        Assertions.assertEquals("II", value);
    }

    @Test
    public void RomainConverter3() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(3);

        Assertions.assertEquals("III", value);
    }

    @Test
    public void RomainConverter4() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(4);

        Assertions.assertEquals("IV", value);
    }

    @Test
    public void RomainConverter5() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(5);

        Assertions.assertEquals("V", value);
    }

    @Test
    public void RomainConverter6() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(6);

        Assertions.assertEquals("VI", value);
    }

    @Test
    public void RomainConverter8() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(8);

        Assertions.assertEquals("VIII", value);
    }

    @Test
    public void RomainConverter9() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(9);

        Assertions.assertEquals("IX", value);
    }

    @Test
    public void RomainConverter10() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(10);

        Assertions.assertEquals("X", value);
    }

    @Test
    public void RomainConverter11() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(11);

        Assertions.assertEquals("XI", value);
    }

    @Test
    public void RomainConverter38() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(38);

        Assertions.assertEquals("XXXVIII", value);
    }

    @Test
    public void RomainConverter40() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(40);

        Assertions.assertEquals("XL", value);
    }

    @Test
    public void RomainConverter44() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(41);

        Assertions.assertEquals("XLI", value);
    }

    @Test
    public void RomainConverter50() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(50);

        Assertions.assertEquals("L", value);
    }

    @Test
    public void RomainConverter69() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(69);

        Assertions.assertEquals("LXIX", value);
    }

    @Test
    public void RomainConverter99() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(99);

        Assertions.assertEquals("XCIX", value);
    }

    @Test
    public void RomainConverter100() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(100);

        Assertions.assertEquals("C", value);
    }

    @Test
    public void RomainConverter119() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(119);

        Assertions.assertEquals("CXIX", value);
    }

    @Test
    public void RomainConverter270() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(200);

        Assertions.assertEquals("CC", value);
    }

    @Test
    public void RomainConverter400() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(400);

        Assertions.assertEquals("CD", value);
    }

    @Test
    public void RomainConverter500() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(500);

        Assertions.assertEquals("D", value);
    }

    @Test
    public void RomainConverter987() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(987);

        Assertions.assertEquals("CMLXXXVII", value);
    }

    @Test
    public void RomainConverter1259() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(1259);

        Assertions.assertEquals("MCCLIX", value);
    }

    @Test
    public void RomainConverter2999() {
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.toRomanNumerals(2999);

        Assertions.assertEquals("MMCMXCIX", value);
    }

    @Test
    public void RomainConverter3100() {
        RomainConverter convertTest = new RomainConverter();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> convertTest.toRomanNumerals(3100));
        assertEquals("Number too big", exception.getMessage());

    }

    @Test
    public void RomainConverter0() {
        RomainConverter convertTest = new RomainConverter();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> convertTest.toRomanNumerals(0));
        assertEquals("Number too small", exception.getMessage());

    }

    @Test
    public void RomainConverterNegative() {
        RomainConverter convertTest = new RomainConverter();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> convertTest.toRomanNumerals(-1));
        assertEquals("Number too small", exception.getMessage());

    }

    @Test
    public void RomainConverterI() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("I");

        Assertions.assertEquals(1, value);
    }

    @Test
    public void RomainConverterII() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("II");

        Assertions.assertEquals(2, value);
    }

    @Test
    public void RomainConverterIII() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("III");

        Assertions.assertEquals(3, value);
    }

    @Test
    public void RomainConverterIV() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("IV");

        Assertions.assertEquals(4, value);
    }

    @Test
    public void RomainConverterV() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("V");

        Assertions.assertEquals(5, value);
    }

    @Test
    public void RomainConverterVI() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("VI");

        Assertions.assertEquals(6, value);
    }

    @Test
    public void RomainConverterIX() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("IX");

        Assertions.assertEquals(9, value);
    }

    @Test
    public void RomainConverterX() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("X");

        Assertions.assertEquals(10, value);
    }

    @Test
    public void RomainConverterXI() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("XI");

        Assertions.assertEquals(11, value);
    }

    @Test
    public void RomainConverterXIV() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("XIV");

        Assertions.assertEquals(14, value);
    }

    @Test
    public void RomainConverterXV() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("XV");

        Assertions.assertEquals(15, value);
    }

    @Test
    public void RomainConverterXIX() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("XIX");

        Assertions.assertEquals(19, value);
    }

    @Test
    public void RomainConverterXXXIX() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("XXXIX");

        Assertions.assertEquals(39, value);
    }

    @Test
    public void RomainConverterXL() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("XL");

        Assertions.assertEquals(40, value);
    }

    @Test
    public void RomainConverterL() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("L");

        Assertions.assertEquals(50, value);
    }

    @Test
    public void RomainConverterLXIX() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("LXIX");

        Assertions.assertEquals(69, value);
    }

    @Test
    public void RomainConverterXC() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("XC");

        Assertions.assertEquals(90, value);
    }

    @Test
    public void RomainConverterC() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("C");

        Assertions.assertEquals(100, value);
    }

    @Test
    public void RomainConverterCCXCIX() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("CCXCIX");

        Assertions.assertEquals(299, value);
    }

    @Test
    public void RomainConverterCD() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("CD");

        Assertions.assertEquals(400, value);
    }

    @Test
    public void RomainConverterD() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("D");

        Assertions.assertEquals(500, value);
    }

    @Test
    public void RomainConverterCM() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("CM");

        Assertions.assertEquals(900, value);
    }

    @Test
    public void RomainConverterM() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("M");

        Assertions.assertEquals(1000, value);
    }

    @Test
    public void RomainConverterMMCDXCIX() {
        RomainConverter convertTest = new RomainConverter();
        int value = convertTest.toArabicNumerals("MMCDXCIX");

        Assertions.assertEquals(2499, value);
    }

    @Test
    public void RomainConverterMMMCMXCIX() {
        RomainConverter convertTest = new RomainConverter();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> convertTest.toArabicNumerals("MMMCMXCIX"));
        assertEquals("Number too big", exception.getMessage());
    }

    @Test
    public void RomainConverterF() {
        RomainConverter convertTest = new RomainConverter();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> convertTest.toArabicNumerals("F"));
        assertEquals("Invalide Number", exception.getMessage());


        
    }

}
