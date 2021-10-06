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
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() + y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        Number.CalculationOperation relationSub = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() - y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        Number.CalculationOperation relationMul = (x, y) -> {
            return null; //To change body of generated lambdas, choose Tools | Templates.
        };

        Number.CalculationOperation relationDiv = (x, y) -> {
            return null; //To change body of generated lambdas, choose Tools | Templates.
        };
    }
}
