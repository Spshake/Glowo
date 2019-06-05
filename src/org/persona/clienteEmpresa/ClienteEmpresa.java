/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.clienteEmpresa;

import org.persona.Persona;

/**
 *
 * @author amx_c
 */
public class ClienteEmpresa extends Persona{
    
    private String nombreEmpresa;

    public ClienteEmpresa(String nombreApellido, String correo, String dni, String provincia, String ciudad, String domicilio, String fechaNac, String telefono) {
        super(nombreApellido, correo, dni, provincia, ciudad, domicilio, fechaNac, telefono);
    }

    
    
    
    
    //
    public ClienteEmpresa(String nombreEmpresa, String nombreApellido, String correo, String dni, String provincia, String ciudad, String domicilio, String fechaNac, String telefono) {
        super(nombreApellido, correo, dni, provincia, ciudad, domicilio, fechaNac, telefono);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    
    
    
    
}
