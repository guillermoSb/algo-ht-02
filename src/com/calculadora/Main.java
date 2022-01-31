package com.calculadora;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Calculator");
        PostfixCalculator calculator = new PostfixCalculator();
        System.out.println(calculator.calculate("1 2 + 4 * 3 +"));
    }
}
