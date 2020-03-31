/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holaMundoAPP.service;

import org.junit.Test;
import static org.junit.Assert.*;
import com.com470.holaMundoAPP.service.ValidarEmail;
/**
 *
 * @author LEO
 */
public class ValidarEmailTest {
    
    ValidarEmail validar= ValidarEmail.getInstance();
    
    
    @Test
    public void testValidarEmailsinArroba(){
        validar.reset();
        boolean resultado = validar.validaEmail("juancarlos.bergman.gmail");
        assertFalse(resultado);
    }
    @Test
    public void testValidaEmail() {
        boolean resultado = validar.validaEmail("juancarlos.bergman.@gmail.com");
        assertTrue(resultado);
    }

    
}
