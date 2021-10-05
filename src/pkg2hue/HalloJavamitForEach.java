package pkg2hue;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HalloJavamitForEach {

    List<String> dieListe = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        HalloJavamitForEach test = new HalloJavamitForEach();
        test.dieListe = Arrays.asList("moin");
        //normale Ausgabe
        for (String string : test.dieListe) {
            System.out.println(string);
        }
        //interface List ausgabe
        test.dieListe.forEach((String s) -> System.out.println(s));

        NumberTester nt = new NumberTester("testdoc.txt");
        nt.testFile();

        //Number
        Number.CalculationOperation relationalAdd = (x, y) -> {
            double x1 = x.getA();
            double x2 = x.getB();

            double y1 = y.getA();
            double y2 = y.getB();

            double erg1 = x1 * y1;
            double erg2 = x2 * y2;

            Number erg = new Number(erg1, erg2);
            return erg;
        };
    }
}
