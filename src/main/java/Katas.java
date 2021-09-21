import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class Katas {
    public int convertFahrenheitToCelcius(int fahrenheit) {
        return (fahrenheit-32)*5/9;
    }

    public int convertCelciusToFahrenheit(int celcius) {
        return celcius*9/5+32;
    }

    public String convertRomanNumeral(int number) {
        return join("", nCopies(number, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");


    }
}
