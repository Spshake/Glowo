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

    
    //Constructor
    public Persona(String nombreApellido, String correo) {
        this.nombreApellido = nombreApellido;
        this.correo = correo;
    }
    
    //Get and Set
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
    
}
