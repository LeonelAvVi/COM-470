/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.p4app.service;

import com.example.p4app.model.MinimoMaximo;
import java.util.List;
import java.util.Arrays;
import java.util.regex.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LEO
 */
public class BuscarMinimoMaximoTest {
    
    public BuscarMinimoMaximoTest() {
    }
    
    private BuscarMinimoMaximo utils = new BuscarMinimoMaximo();
    
    @Test
    public void testBuscaminimoMaximoIs() {
        List<Integer> lista=Arrays.asList(3,2,1,55,2,4,8,20);
        MinimoMaximo esperado = new MinimoMaximo(1,55);
        testMatIs(esperado, lista);
    }
    
    private void testMatIs(MinimoMaximo esperado,List<Integer> lista){
        assertThat(esperado, Matchers.is(utils.buscaminimoMaximo(lista)));
    }

    @Test
    public void testBuscaminimoMaximoNotNullValue() {
        List<Integer> lista=Arrays.asList(3,2,1,55,2,4,8,20);
        MinimoMaximo esperado = new MinimoMaximo(1,55);
        testNotNullValue(esperado, lista);
    }
    
    private void testNotNullValue(MinimoMaximo esperado,List<Integer> lista){
        assertThat(esperado, Matchers.notNullValue());
    }

    
    @Test
    public void testBuscaminimoMaximoEqual() {
        List<Integer> lista=Arrays.asList(3,2,1,55,2,4,8,20);
        MinimoMaximo esperado = new MinimoMaximo(1,55);
        testMatEqual(esperado, lista);
    }
    
    
    private void testMatEqual(MinimoMaximo esperado,List<Integer> lista){
        assertThat(esperado, Matchers.equalTo(utils.buscaminimoMaximo(lista)));
    }
}
