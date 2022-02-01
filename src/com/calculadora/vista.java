package com.calculadora;

public class vista {
    public void saludo() {
        System.out.println("Hola y bienvenido a la calculadora");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void menu() {
        System.out.println("1. Usar calculadora");
        System.out.println("2. Salir");
    }
    public void ask() {
        System.out.println("Diga la operación que desa realizar");
    }
    public void respuesta() {
        System.out.println("La respuesta de tu operación es:");
    }
}
