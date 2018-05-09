/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rubik.desk.trevino.model;

import java.util.Date;

/**
 *
 * @author Dev
 */
public class Reporte {
    
    String nombre;
    String curp;
    String puesto;
    String curso;
    String duracion;
    Date fecha_inicio;
    Date fecha_fin;
    String cine;
    String region;
    
    String f_inicio;
    String f_fin;
    
    String zona;
    String jefatura;
    String empleado_id;
    String nombre_capacitador;
    String correo;
    String region_capacitador;
    String ubicacion;
    String file;
    
    String seguridad_nombre;
    String seguridad_file;

    public Reporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

    public String getNombre_capacitador() {
        return nombre_capacitador;
    }

    public void setNombre_capacitador(String nombre_capacitador) {
        this.nombre_capacitador = nombre_capacitador;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRegion_capacitador() {
        return region_capacitador;
    }

    public void setRegion_capacitador(String region_capacitador) {
        this.region_capacitador = region_capacitador;
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

    public String getSeguridad_nombre() {
        return seguridad_nombre;
    }

    public void setSeguridad_nombre(String seguridad_nombre) {
        this.seguridad_nombre = seguridad_nombre;
    }

    public String getSeguridad_file() {
        return seguridad_file;
    }

    public void setSeguridad_file(String seguridad_file) {
        this.seguridad_file = seguridad_file;
    }

    public String getF_inicio() {
        return f_inicio;
    }

    public void setF_inicio(String f_inicio) {
        this.f_inicio = f_inicio;
    }

    public String getF_fin() {
        return f_fin;
    }

    public void setF_fin(String f_fin) {
        this.f_fin = f_fin;
    }

    @Override
    public String toString() {
        return "Reporte{" + "nombre=" + nombre + ", curp=" + curp + ", puesto=" + puesto + ", curso=" + curso + ", duracion=" + duracion + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", cine=" + cine + ", region=" + region + ", f_inicio=" + f_inicio + ", f_fin=" + f_fin + ", zona=" + zona + ", jefatura=" + jefatura + ", empleado_id=" + empleado_id + ", nombre_capacitador=" + nombre_capacitador + ", correo=" + correo + ", region_capacitador=" + region_capacitador + ", ubicacion=" + ubicacion + ", file=" + file + ", seguridad_nombre=" + seguridad_nombre + ", seguridad_file=" + seguridad_file + '}';
    }
    
}