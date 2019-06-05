/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.cliente;

import org.persona.Persona;

/**
 *
 * @author amx_c
 */

public class Cliente extends Persona{

    public Cliente(String nombreApellido, String correo, String dni, String provincia, String ciudad, String domicilio, String fechaNac, String telefono)
        {
        super(nombreApellido, correo, dni, provincia, ciudad, domicilio, fechaNac, telefono);
    }
}


