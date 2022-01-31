package com.calculadora;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Calculator");
        PostfixCalculator calculator = new PostfixCalculator();
        // TODO: Usar un menu e ingresar los contenidos del archivo de texto en el metodo calculate.
        System.out.println(calculator.calculate("6 2 3 + *"));
    }
}
