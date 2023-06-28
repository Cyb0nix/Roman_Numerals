import org.example.RomainConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class MainTest {


    @Test
    public void RomainConverter(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(1);

        Assertions.assertEquals("I", value);
    }

    @Test
    public void RomainConverter2(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(2);

        Assertions.assertEquals("II", value);
    }

    @Test
    public void RomainConverter3(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(3);

        Assertions.assertEquals("III", value);
    }

    @Test
    public void RomainConverter4(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(4);

        Assertions.assertEquals("IV", value);
    }

    @Test
    public void RomainConverter5(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(5);

        Assertions.assertEquals("V", value);
    }

    @Test
    public void RomainConverter6(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(6);

        Assertions.assertEquals("VI", value);
    }

    @Test
    public void RomainConverter8(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(8);

        Assertions.assertEquals("VIII", value);
    }

    @Test
    public void RomainConverter9(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(9);

        Assertions.assertEquals("IX", value);
    }

    @Test
    public void RomainConverter10(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(10);

        Assertions.assertEquals("X", value);
    }

    @Test
    public void RomainConverter11(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(11);

        Assertions.assertEquals("XI", value);
    }

    @Test
    public void RomainConverter38(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(38);

        Assertions.assertEquals("XXXVIII", value);
    }

    @Test
    public void RomainConverter40(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(40);

        Assertions.assertEquals("XL", value);
    }

    @Test
    public void RomainConverter44(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(41);

        Assertions.assertEquals("XLI", value);
    }

    @Test
    public void RomainConverter50(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(50);

        Assertions.assertEquals("L", value);
    }

    @Test
    public void RomainConverter69(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(69);

        Assertions.assertEquals("LXIX", value);
    }

    @Test
    public void RomainConverter99(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(99);

        Assertions.assertEquals("XCIX", value);
    }

    @Test
    public void RomainConverter100(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(100);

        Assertions.assertEquals("C", value);
    }

    @Test
    public void RomainConverter119(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(119);

        Assertions.assertEquals("CXIX", value);
    }

    @Test
    public void RomainConverter270(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(200);

        Assertions.assertEquals("CC", value);
    }

    @Test
    public void RomainConverter400(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(400);

        Assertions.assertEquals("CD", value);
    }

    @Test
    public void RomainConverter500(){
        RomainConverter convertTest = new RomainConverter();
        String value = convertTest.convertToRomanNumber(500);

        Assertions.assertEquals("D", value);
    }


}
