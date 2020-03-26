/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holaMundoAPP.controller;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LEO
 */
public class HolaMundoControllerTest {

    @Test
    public void testMensaje() {
        System.out.println("mensaje");
        HolaMundoController instance = new HolaMundoController();
        String expResult = "Hola mundo";
        String result = instance.mensaje();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
