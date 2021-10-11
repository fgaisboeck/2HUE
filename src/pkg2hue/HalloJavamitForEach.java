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
        Number.CalculationOperation vectorAdd = (x, y) -> {
            double a = x.getA() + y.getA();
            double b = x.getB() + y.getB();
            

            Number erg = new Number(a, b);
            return erg;
        };

        Number.CalculationOperation vectorSub = (x, y) -> {
            double a = x.getA() - y.getA();
            double b = x.getB() - y.getB();
            

            Number erg = new Number(a, b);
            return erg;
        };

        Number.CalculationOperation vectorMul = (x, y) -> {
            double a = x.getA()*y.getB();
            double b = x.getB() * y.getA();
           

            Number erg = new Number(a, b);
            return erg;
        };

        //funktioniert nicht
        Number.CalculationOperation vectorDiv = (x, y) -> {
            double a = (x.getA() + y.getB() *  y.getA() * y.getB());
            
            //double längeA = Math.pow(x.getA()*x.getA() + x.getB() * x.getB(), 0,5);
            //double längeB = Math.pow(y.getA()*y.getA() + y.getB() * y.getB(), 0,5);
          
            
            double b = x.getB() * y.getB();
            

            Number erg = new Number(a, b);
            return erg;
        };

        VectorCalculator VectorC = new VectorCalculator(vectorAdd, vectorSub, vectorMul, vectorDiv);

        //ComplexCalculator
        Number.CalculationOperation complexAdd = (x, y) -> {
            double a = x.getA() + y.getA();
            double b = x.getB() + y.getB();
            

            Number erg = new Number(a, b);
            return erg;
        };

        Number.CalculationOperation complexSub = (x, y) -> {
            double a = 0;
            if(x.getB()*y.getB()<0)
            {
                double zwischenErg = (-1)*(x.getB()*y.getB());
                a = (x.getA()*y.getA()) + zwischenErg;
            }
            else
            {
                a = (x.getA()*y.getA()) + (x.getB()*y.getB());
            }
           
            double b = x.getB() - y.getB();
            

            Number erg = new Number(a, b);
            return erg;
        };

        Number.CalculationOperation complexMul = (x, y) -> {
            return null;
        };

        Number.CalculationOperation complexDiv = (x, y) -> {
            return null;
        };

        ComplexCalculator complexC = new ComplexCalculator(complexAdd, complexSub, complexMul, complexDiv);
    }
}
