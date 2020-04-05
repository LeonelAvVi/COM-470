/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.p4app.model;

import java.util.Objects;

/**
 *
 * @author LEO
 */
public class MinimoMaximo {
    Integer min;
    Integer max;

    public MinimoMaximo(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.min);
        hash = 53 * hash + Objects.hashCode(this.max);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MinimoMaximo other = (MinimoMaximo) obj;
        if (!Objects.equals(this.min, other.min)) {
            return false;
        }
        if (!Objects.equals(this.max, other.max)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MinimoMaximo{" + "min=" + min + ", max=" + max + '}';
    }
    
    
    
}
