/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2hue;

/**
 *
 * @author gaisb
 */
public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator(Number.CalculationOperation add, Number.CalculationOperation subtract, Number.CalculationOperation multiply, Number.CalculationOperation divide) {
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
