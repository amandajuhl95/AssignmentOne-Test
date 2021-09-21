import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KatasTest {

    @Test
    public void fahrenheitToCelciusConverterTest() {
        Katas katas = new Katas();

        int result = katas.convertFahrenheitToCelcius(100);
        int expected = 37;

        assertEquals(expected, result);

    }

    @Test
    public void CelciusToFahrenheitConverterTest() {
        Katas katas = new Katas();

        int result = katas.convertCelciusToFahrenheit(20);
        int expected = 68;

        assertEquals(expected, result);

    }

    @Test
    public void RomanNumeralConverter() {
        Katas katas = new Katas();

        String result = katas.convertRomanNumeral(10);
        String expected = "X";

        assertEquals(expected, result);

    }



}
