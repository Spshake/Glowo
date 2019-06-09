/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.empresa;

import org.persona.clienteEmpresa.ClienteEmpresa;

/**
 *
 * @author amx_c
 */
public class Empresa extends ClienteEmpresa{
    private String tipoEmpresa;

    public Empresa(String nombreApellido, String correo, String dni, String provincia, String ciudad, String domicilio, String fechaNac, String telefono) {
        super(nombreApellido, correo, dni, provincia, ciudad, domicilio, fechaNac, telefono);
    }

    public Empresa(String tipoEmpresa, String nombreApellido, String correo, String dni, String provincia, String ciudad, String domicilio, String fechaNac, String telefono) {
        super(nombreApellido, correo, dni, provincia, ciudad, domicilio, fechaNac, telefono);
        this.tipoEmpresa = tipoEmpresa;
    }

    public Empresa(String tipoEmpresa, String nombreEmpresa, String nombreApellido, String correo, String dni, String provincia, String ciudad, String domicilio, String fechaNac, String telefono) {
        super(nombreEmpresa, nombreApellido, correo, dni, provincia, ciudad, domicilio, fechaNac, telefono);
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }


    
    
}
