/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.repartidor;

import org.persona.Persona;

/**
 *
 * @author amx_c
 */
public class Repartidor extends Persona{
    
    private String TipoDeTransporte;

    public Repartidor(String nombreApellido, String correo, String dni, String provincia, String ciudad, String domicilio, String fechaNac, String telefono) {
        super(nombreApellido, correo, dni, provincia, ciudad, domicilio, fechaNac, telefono);
    }

    public Repartidor(String TipoDeTransporte, String nombreApellido, String correo, String dni, String provincia, String ciudad, String domicilio, String fechaNac, String telefono) {
        super(nombreApellido, correo, dni, provincia, ciudad, domicilio, fechaNac, telefono);
        this.TipoDeTransporte = TipoDeTransporte;
    }

    public String getTipoDeTransporte() {
        return TipoDeTransporte;
    }

    public void setTipoDeTransporte(String TipoDeTransporte) {
        this.TipoDeTransporte = TipoDeTransporte;
    }
 
    
    
}
