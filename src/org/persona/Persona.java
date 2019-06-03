/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona;

/**
 *
 * @author Gonzalo
 */
public class Persona {
    
    private String nombreApellido; 
    private String correo;
    private String dni;
    private String provincia;
    private String ciudad;
    private String domicilio;
    private String fechaNac;
    private String telefono;

    public Persona(String nombreApellido, String correo, String dni, String provincia, String ciudad, String domicilio, String fechaNac, String telefono) {
        this.nombreApellido = nombreApellido;
        this.correo = correo;
        this.dni = dni;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
