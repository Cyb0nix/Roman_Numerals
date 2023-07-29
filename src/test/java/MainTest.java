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

}
