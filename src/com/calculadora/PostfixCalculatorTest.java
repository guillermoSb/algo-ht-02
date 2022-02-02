package com.calculadora;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PostfixCalculatorTest {

    PostfixCalculator calculator = new PostfixCalculator();
    
    @Test
    public void testAdd(){
        
        assertTrue("El resultado debe ser 0 si no se ha agregado nada",calculator.size() == 0);
        calculator.add(5.0);
        assertTrue("El resultado debe ser 1, si se ha agregado 1",calculator.size() == 1);
    }

    @Test
    public void testRemove(){
        
        calculator.add(1.0);
        calculator.add(5.0);
        calculator.remove();
        assertTrue("El resultado debería ser 1 luego de remover 1", calculator.remove() == 1);

    }

    @Test
    public void testPeek(){

        calculator.add(8.9);
        assertTrue("El resultado debería ser 8.9", calculator.peek()== 8.9);
        calculator.add(9.5);
        assertFalse("El resultado no debe ser 8.9", calculator.peek()==8.9);
        assertTrue("El resultado debe ser 9.5", calculator.peek()== 9.5);
    }

    @Test
    public void testEmpty(){

        assertTrue("Calculator debe ser vacío inicialmente", calculator.empty() == true);
        calculator.add(5.2);
        assertTrue("Luego de agregar algo, no será vacío", calculator.empty() == false);
    }

    @Test
    public void testSize(){

        assertEquals(0, calculator.size());
        calculator.add(1.4);
        assertTrue("El tamaño debería ser 1 luego de agregar algo", calculator.size() == 1);
        calculator.remove();
        assertFalse("El tamaño no debería ser 1 luego de remover el valor agregado", calculator.size()== 1);
    }

    @Test
    public void testCalculate(){

        assertTrue("El resultado debe ser 5", calculator.calculate("3 2 +") == 5);

        assertTrue("El resultado debe ser 15", calculator.calculate("1 2 + 4 * 3 +") == 15.0);

        assertTrue("El resultado debe ser 35", calculator.calculate("4 3 + 5 *") == 35);

        assertTrue("El resultado debe ser 30", calculator.calculate("6 2 3 + *") == 30);

        assertTrue("El resultado debe ser 15", calculator.calculate("9 1 2 + 2 * +") == 15);

    }



}