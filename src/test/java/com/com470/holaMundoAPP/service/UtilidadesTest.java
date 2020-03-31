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
public class UtilidadesTest {

    @Test
    public void testConcatenar() {
        System.out.println("concatenar");
        String uno = "Hola";
        String dos = "Mundo";
        Utilidades instance = new Utilidades();
        String expResult = "Hola Mundo";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testConcatenarFallo() {
        System.out.println("concatenar");
        String uno = "Hola";
        String dos = "Mundo";
        Utilidades instance = new Utilidades();
        String expResult = "Hola Mundo";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testConcatenarError() {
        System.out.println("concatenar");
        String uno = null;
        String dos = "Mundo";
        Utilidades instance = new Utilidades();
        String expResult = null;
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
