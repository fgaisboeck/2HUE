package pkg2hue;

public class RationalCalculator extends AbstractCalculator {

    public RationalCalculator(Number.CalculationOperation add, Number.CalculationOperation subtract, Number.CalculationOperation multiply, Number.CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        Number n = add.calc(a, b);
        return n;
    }

    @Override
    public Number subtract(Number a, Number b) {
        Number n = subtract.calc(a, b);
        return n;
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number n = multiply.calc(a, b);
        return n;
    }

    @Override
    public Number divide(Number a, Number b) {
        Number n = divide.calc(a, b);
        return n;
    }
}
