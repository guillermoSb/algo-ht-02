package com.calculadora;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.naming.ldap.Rdn;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Calculator");
        PostfixCalculator calculator = new PostfixCalculator();
        Scanner sc = new Scanner(System.in);
        File file = new File("datos.txt");
        Scanner rd;
        try {
            rd = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Vista v = new Vista();
        v.saludo();
        int ot = 0;
        while (ot != 3) {
            v.menu();
            ot = sc.nextInt();
            if (ot == 1) {
                v.ask();
                String op = sc.nextLine();
                v.respuesta();
                System.out.println(calculator.calculate(op));
                 
            }
            if (ot == 2) {
                while (rd.hasNextLine())
                v.respuesta();
                System.out.println(calculator.calculate(rd.hasNextLine()));
        }
        }
        // TODO: Usar un menu e ingresar los contenidos del archivo de texto en el metodo calculate.
    }
}
