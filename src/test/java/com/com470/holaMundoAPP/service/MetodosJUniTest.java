/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holaMundoAPP.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LEO
 */
public class MetodosJUniTest {
    
    public MetodosJUniTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("antes de todos los Test");
    }
    
    @AfterClass
    public static void tearDownClass() {
         System.out.println("despues de todos los Test");
    }
    
    @Before
    public void setUp() {
        System.out.println("antes de cada Test");
    }
    
    @After
    public void tearDown() {
        System.out.println("despues de cada Test");
    }

    @Test
    public void primerTest() {
        System.out.println("Primer Test");
        fail("The test case is a prototype.");
    }
        @Test
    public void segundoTest() {
        System.out.println("segundo Test");
        fail("The test case is a prototype.");
    }
    
}
