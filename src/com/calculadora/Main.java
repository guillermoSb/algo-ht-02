package com.calculadora;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.ldap.Rdn;
public class Main {

    public static void main(String[] args) {
        // CALCULATOR ADT
        PostfixCalculator calculator = new PostfixCalculator();
        // CALCULATOR ADT
        Scanner sc = new Scanner(System.in);    // Scanner for user input
        File file = new File("datos.txt");  // File to be loaded
        Scanner rd; // Scanner for the file
        try {
            rd = new Scanner(file); // Init scanner with file
            Vista v = new Vista();  // Init view
            v.saludo(); // Greet the user
            int ot = 0; // Save the user option
            while (ot != 2) {
                v.menu();   // Show the menu
                System.out.print("Ingresa tu opcion: ");
                ot = sc.nextInt();  // Ask for the user option
                if (ot == 1) {
                    while (rd.hasNextLine()){
                        String line = rd.nextLine();
                        try {
                            double result = calculator.calculate(line);
                            System.out.printf("Result is: %.1f\n", result);
                        } catch (Exception e) {
                            System.out.printf("Error: La operacion: %s no tiene el formato adecuado.\n",line);    // Calculate each line
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error cargando el archivo datos.txt");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Error, por favor ingresa un numero.");
        }

        // TODO: Usar un menu e ingresar los contenidos del archivo de texto en el metodo calculate.
    }
}
