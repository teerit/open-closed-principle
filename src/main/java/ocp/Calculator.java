package ocp;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw  new InvalidParameterException("Can't perform operation");
        }

        operation.perform();
    }
}
