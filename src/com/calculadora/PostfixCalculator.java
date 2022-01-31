package com.calculadora;

import java.util.ArrayList;
import java.util.Vector;

public class PostfixCalculator implements Stack<Double>, Calculator{

    Vector<Double> data;

    PostfixCalculator() {
        data = new Vector<Double>();
    }

    @Override
    public void add(Double item) {
        data.add(item);
    }

    @Override
    public Double remove() {
        return data.remove(size() - 1);
    }

    @Override
    public Double peek() {
        return data.get(size() - 1);
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public double calculate(String operation) {
        // Split the operation into sub components
        String[] splittedOperation = operation.split(" ");
        // Itterate through each value on the operation
        for (String value:
             splittedOperation) {
            // TODO: Handle error
            if (!isNumber(value) && !isOperator(value)) {
                return 0;
            }

            // If the value is a number, add it to the stack
            if (isNumber(value)) {
               add(Double.parseDouble(value));
            }
            // If the value is an operator, start operating two values
            if(isOperator(value)) {
                // Todo: Handle Exception
                Double operatorA = remove();
                Double operatorB = remove();
                String operator = value;
                Double result = operate(operatorA, operatorB, operator);
                add(result);
            }
        }
        return remove();
    }

    /**
     * Operate two values
     * @param a Operator 1
     * @param b Operator 2
     * @param operator operation. +, -, /, *
     * @return
     */
    private double operate(Double a, Double b, String operator) {
        if (operator.equals("+")) return a + b;
        if (operator.equals("-")) return a + b;
        if (operator.equals("*")) return a * b;
        if (operator.equals("/")) return a / b;
        return 0;   // Last instance
    }

    private boolean isNumber(String value) {
        try {
            Double number = Double.parseDouble(value);
            return true;
        } catch (Exception e) {
            return  false;
        }
    }

    private boolean isOperator(String value) {
        if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
            return true;
        }
        return false;
    }
}
