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
        //Rational
        Number.CalculationOperation rationalAdd = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() + y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        Number.CalculationOperation rationalSub = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() - y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        Number.CalculationOperation rationalMul = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() - y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        Number.CalculationOperation rationalDiv = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() - y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        RationalCalculator rationalC = new RationalCalculator(rationalAdd, rationalSub, rationalMul, rationalDiv);

        //VectorCalculator
        //no
        Number.CalculationOperation vectorAdd = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() + y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        Number.CalculationOperation vectorSub = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() - y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        Number.CalculationOperation vectorMul = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() - y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        Number.CalculationOperation vectorDiv = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() - y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        VectorCalculator VectorC = new VectorCalculator(vectorAdd, vectorSub, vectorMul, vectorDiv);

        //ComplexCalculator
        //no
        Number.CalculationOperation complexAdd = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() + y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        Number.CalculationOperation complexSub = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() - y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        Number.CalculationOperation complexMul = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() - y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        Number.CalculationOperation complexDiv = (x, y) -> {
            double nenner = x.getB() * y.getB();
            double zaehler = (x.getB() * y.getA() - y.getB() * x.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

        ComplexCalculator complexC = new ComplexCalculator(complexAdd, complexSub, complexMul, complexDiv);
    }
}
