/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rubik.desk.trevino.model;

/**
 *
 * @author Dev
 * 
 * 
 */
public class Capacitador {
    
    String zona;
    String jefatura;
    String empleado_id;
    String nombre;
    String correo;
    String region;
    String ubicacion;
    String file;

    public Capacitador() {
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getJefatura() {
        return jefatura;
    }

    public void setJefatura(String jefatura) {
        this.jefatura = jefatura;
    }

    public String getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(String empleado_id) {
        this.empleado_id = empleado_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Capacitador{" + "zona=" + zona + ", jefatura=" + jefatura + ", empleado_id=" + empleado_id + ", nombre=" + nombre + ", correo=" + correo + ", region=" + region + ", ubicacion=" + ubicacion + ", file=" + file + '}';
    }
    
}