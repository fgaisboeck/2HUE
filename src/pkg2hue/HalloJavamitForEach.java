package pkg2hue;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        test.dieListe.forEach(System.out::print);

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
            double nenner = x.getB() * y.getA();
            double zaehler = x.getA() * y.getB();

            Number erg = new Number(zaehler, nenner);
            return erg;
        };

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
            double a = x.getA() * y.getB();
            double b = x.getB() * y.getA();

            Number erg = new Number(a, b);
            return erg;
        };

        //funktioniert nicht
        Number.CalculationOperation vectorDiv = (x, y) -> {
            double a = (x.getA() + y.getB() * y.getA() * y.getB());

            //double längeA = Math.sqrt(x.getA() * x.getA() + x.getB() * x.getB());
            //double längeB = Math.pow(y.getA()*y.getA() + y.getB() * y.getB(), 0,5);
            double b = x.getB() * y.getB();

            Number erg = new Number(a, b);
            return erg;
        };

        //ComplexCalculator
        Number.CalculationOperation complexAdd = (x, y) -> {
            double a = x.getA() + y.getA();
            double b = x.getB() + y.getB();

            Number erg = new Number(a, b);
            return erg;
        };

        Number.CalculationOperation complexSub = (x, y) -> {
            double a = x.getA() - y.getA();
            double b = x.getB() - y.getB();

            Number erg = new Number(a, b);
            return erg;
        };

        Number.CalculationOperation complexMul = (x, y) -> {
            double a = (x.getA() * y.getA()) - (x.getB() * y.getB());
            double b = (x.getA() * y.getB()) + (x.getB() * y.getA());
            Number erg = new Number(a, b);
            return erg;
        };

        //funktioniert nicht
        //quadrieren
        Number.CalculationOperation complexDiv = (x, y) -> {
            double a = (x.getA() * y.getA()) - (x.getB() * y.getB());
            double b = (x.getA() * y.getB()) + (x.getB() * y.getA());
            Number erg = new Number(a, b);
            return erg;
        };

        Scanner sc = new Scanner(System.in);
        boolean b1 = true;

        while (b1) {
            System.out.println("Choose calculator:");
            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - Exit program");

            int eing1 = Integer.parseInt(sc.nextLine());

            if (eing1 == 4) {
                break;
            } else if (eing1 < 1 || eing1 > 3) {
                System.out.println("Bitte ein Zahl von 1-4 eingeben");
            } else {
                int eing2 = 5;

                Number x = null;
                Number y = null;
                Number erg = null;

                while (eing2 == 5) {
                    System.out.println("Enter number x a");
                    int eingXA = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter number x b");
                    int eingXB = Integer.parseInt(sc.nextLine());
                    x = new Number(eingXA, eingXB);

                    System.out.println("Enter number y a");
                    int eingYA = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter number y b");
                    int eingYB = Integer.parseInt(sc.nextLine());
                    y = new Number(eingYA, eingYB);

                    System.out.println("Choose operation:");
                    System.out.println("1 - add");
                    System.out.println("2 - subtract");
                    System.out.println("3 - multiply");
                    System.out.println("4 - divide");
                    System.out.println("5 - enter numbers again");

                    eing2 = Integer.parseInt(sc.nextLine());
                }

                AbstractCalculator calc = null;

                switch (eing1) {
                    case 1:
                        calc = new RationalCalculator(rationalAdd, rationalSub, rationalMul, rationalDiv);
                        break;
                    case 2:
                        calc = new VectorCalculator(vectorAdd, vectorSub, vectorMul, vectorDiv);
                        break;
                    case 3:
                        calc = new ComplexCalculator(complexAdd, complexSub, complexMul, complexDiv);

                        break;
                }

                switch (eing2) {
                    case 1:
                        erg = calc.add(x, y);
                        break;

                    case 2:
                        erg = calc.subtract(x, y);
                        break;

                    case 3:
                        erg = calc.multiply(x, y);
                        break;

                    case 4:
                        erg = calc.divide(x, y);
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }

                System.out.println("-----------");
                System.out.println("Solution:");
                System.out.println("a = " + erg.getA());
                System.out.println("b = " + erg.getB());
                System.out.println("-----------");
            }

        }

    }
}
