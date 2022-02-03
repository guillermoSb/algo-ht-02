package com.calculadora;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.naming.ldap.Rdn;
public class Main {

    public static void main(String[] args) {
	// write your code here
        PostfixCalculator calculator = new PostfixCalculator(); //
        Scanner sc = new Scanner(System.in);
        File file = new File("datos.txt");
        Scanner rd;
        try {
            rd = new Scanner(file);
            Vista v = new Vista();
            v.saludo();
            int ot = 0;
            while (ot != 2) {
                v.menu();
                ot = sc.nextInt();
                if (ot == 1) {
                    while (rd.hasNextLine()){
                        System.out.println(calculator.calculate(rd.nextLine()));
                    }


                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("NO");
            e.printStackTrace();
        }

        // TODO: Usar un menu e ingresar los contenidos del archivo de texto en el metodo calculate.
    }
}
