package pkg2hue;

public class RationalCalculator extends AbstractCalculator {

    public RationalCalculator(Number.CalculationOperation add, Number.CalculationOperation subtract, Number.CalculationOperation multiply, Number.CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    //unsicher
    @Override
    public Number add(Number a, Number b) {
            double nenner = a.getB() * b.getB();
            double zaehler = (a.getB() * b.getA() + b.getB() * a.getA());

            Number erg = new Number(zaehler, nenner);
            return erg;
    }

    @Override
    public Number subtract(Number a, Number b) {
            double nenner = a.getB() * b.getB();
            double zaehler = (a.getB() * b.getA() - b.getB() * a.getA());

            Number erg = new Number(zaehler, nenner);
            return erg; }

    @Override
    public Number multiply(Number a, Number b) {
            double nenner = a.getB() * b.getB();
            double zaehler = a.getA() * b.getA();

            Number erg = new Number(zaehler, nenner);
            return erg; }
    

    @Override
    public Number divide(Number a, Number b) {
         double nenner = a.getB() * b.getA();
            double zaehler = a.getA() * b.getB();

            Number erg = new Number(zaehler, nenner);
            return erg; }
    }

