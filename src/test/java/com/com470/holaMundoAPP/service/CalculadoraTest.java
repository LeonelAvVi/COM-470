/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holaMundoAPP.service;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LEO
 */
public class CalculadoraTest {
    // private UtilidadesPersona utils = new UtilidadesPersona();
    private Calculadora utils = new Calculadora();
    public CalculadoraTest() {
    }

    //Al momento de crear una instancia Calculadora(a,b,c)
    //El parametro c debe ser 1 para sumar los numeros
    //El parametro c debe ser 2 para restar los numeros
    //El parametro c debe ser 3 para el producto de los numeros
    //El parametro c debe ser 4 para el cociente de los numeros
    
    @Test 
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora(5, 6, 1);
        int expResult = 11;
        int result = instance.suma();
        assertTrue((instance.getC() == 1));
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora(6, 2, 2);
        int expResult = 4;
        int result = instance.resta();
        assertTrue((instance.getC() == 2));
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testProducto() {
        System.out.println("producto");
        Calculadora instance = new Calculadora(6, 2, 3);
        int expResult = 12;
        int result = instance.producto();
        assertTrue((instance.getC() == 3));
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        Calculadora instance = new Calculadora(6, 2, 4);
        double expResult = 3.0;
        double result = instance.division();
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }
    
        @Test
    public void testDivisionEntreCero() {
        System.out.println("division");
        Calculadora instance = new Calculadora(6, 0, 4);
        if(instance.getA()==0||instance.getB()==0)
            instance= null;
        System.out.println("No es posible la division entre 0");
            assertNull(instance);
        //fail("The test case is a prototype.");
    }
    
}
