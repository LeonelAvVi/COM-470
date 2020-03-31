/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holaMundoAPP.service;

/**
 *
 * @author LEO
 */
public class Calculadora {
    private int a;
    private int b;
    private int c;

    public Calculadora(){
    }
    
    public Calculadora(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public int suma(){
        return a+b;
    }
    
    public int resta(){
        return a-b;
    }
    
    public int producto(){
        return a*b;
    }
    
    public double division(){
        if(a==0) return 0;
        if (b==0) return 0;
        return (double) a/b;
    }
          
    
}
