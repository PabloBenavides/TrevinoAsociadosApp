/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rubik.desk.trevino.model;

/**
 *
 * @author Dev
 */
public class Seguridad {
    
    String nombre;
    String file;

    public Seguridad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Seguridad{" + "nombre=" + nombre + ", file=" + file + '}';
    }
    
}