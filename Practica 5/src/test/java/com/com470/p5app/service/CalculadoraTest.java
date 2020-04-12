/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.p5app.service;
import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author LEO
 */

@RunWith(Parameterized.class)
public class CalculadoraTest {
    
    
    @Parameterized.Parameters
    public static List<Object>datos(){
        return Arrays.asList(new Object[][]{
            {2,1},{1,0},{1,9},{10,2}
        });
    }
    
    @Parameter(0)
    public int valor1;
    @Parameter(1)
    public int valor2;
    
     Calculadora utils = new Calculadora();
    
    
    public CalculadoraTest() {
    }

    @Test
    public void testSuma() {
        System.out.println("Suma");
        System.out.println("Ejecucion son:"+valor1+" "+valor2);
        int resultado = utils.suma(valor1, valor2);
        int esperado = valor1+valor2;
        System.out.println("resultado:"+resultado+"esperado:"+esperado);
        
        assertEquals(esperado, resultado);
    }

    @Test
    public void testResta() {
        System.out.println("Resta");
        System.out.println("Ejecucion son:"+valor1+" "+valor2);
        int resultado = utils.resta(valor1, valor2);
        int esperado = valor1-valor2;
        System.out.println("resultado:"+resultado+"esperado:"+esperado);
        
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMultimplicacion() {
        System.out.println("Producto");
        System.out.println("Ejecucion son:"+valor1+" "+valor2);
        int resultado = utils.multimplicacion(valor1, valor2);
        int esperado = valor1*valor2;
        System.out.println("resultado:"+resultado+"esperado:"+esperado);
        
        assertEquals(esperado, resultado);
    }

    @Test
    public void testDivision() {
        System.out.println("Division");
        if(valor2!=0){
                System.out.println("Ejecucion son:"+valor1+" "+valor2);
                int resultado = utils.division(valor1, valor2);

                int esperado = valor1/valor2;
                System.out.println("resultado:"+resultado+"esperado:"+esperado);

                assertEquals(esperado, resultado);
            
        }else{
            System.out.println("Division Entre 0 No es posible dividir");
        }

    }
    
}
