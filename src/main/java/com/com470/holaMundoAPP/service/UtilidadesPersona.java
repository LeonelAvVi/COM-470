/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holaMundoAPP.service;

import com.com470.holaMundoAPP.repository.Persona;

/**
 *
 * @author LEO
 */
public class UtilidadesPersona {
    private Persona carlos;
    private Persona juan;
    
    public UtilidadesPersona(){
        carlos = new Persona("Carlos", "Romero");
        juan = new Persona("Juan", "Perez");
    }

    public Persona getCarlos() {
        return carlos;
    }

    public Persona getJuan() {
        return juan;
    }
    
    
    
}
