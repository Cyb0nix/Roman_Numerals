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
}
