package ocp;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        try {
            operation.perform();
        } catch (Exception exception) {
            throw new InvalidParameterException("Can't perform operation");
        }
    }
}
