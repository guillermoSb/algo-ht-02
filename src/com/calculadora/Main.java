package com.calculadora;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Calculator");
        PostfixCalculator calculator = new PostfixCalculator();
        Scanner sc = new Scanner(System.in);
        vista v = new vista();
        v.saludo();
        int ot = 0;
        while (ot != 2) {
            v.menu();
            ot = sc.nextInt();
            if (ot == 1) {
                v.ask();
                String op = sc.nextLine();
                v.respuesta();
                System.out.println(calculator.calculate(op));
                 
            }
        }
        // TODO: Usar un menu e ingresar los contenidos del archivo de texto en el metodo calculate.
    }
}
