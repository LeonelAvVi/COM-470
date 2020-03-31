/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holaMundoAPP.service;

import com.com470.holaMundoAPP.repository.Persona;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LEO
 */
public class UtilidadesPersonaTest {
    private UtilidadesPersona utils = new UtilidadesPersona();
    
    public UtilidadesPersonaTest() {
    }

    @Test
    public void testCarlos() {
        //when
        Persona carlos=utils.getCarlos();
        //then 
        assertEquals("Carlos", carlos.getNombre());
        assertEquals("Romero", carlos.getApellido());
        
    }
    
    @Test
    public void testJuan() {
        //when
        Persona juan=utils.getJuan();
        //then 
        assertEquals("Juan", juan.getNombre());
        assertEquals("Perez", juan.getApellido());
        
    }
        
    @Test
    public void testPersonasDiferentes() {
        //when
        Persona juan=utils.getJuan();
        Persona carlos=utils.getCarlos();
        //then 
        assertEquals("Juan", juan.getNombre());
        assertEquals("Perez", juan.getApellido());
        
        assertNotEquals(carlos, juan);
        
    }
    
}
