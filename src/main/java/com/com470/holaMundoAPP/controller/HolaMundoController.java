/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holaMundoAPP.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LEO
 */
@RestController

public class HolaMundoController {
    @RequestMapping(value="/")
    public String mensaje(){
        return "Hola mundo";
    }
    
}
