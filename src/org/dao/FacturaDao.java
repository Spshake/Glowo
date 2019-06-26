/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import org.factura.Factura;

/**
 *
 * @author Gonzalo
 */
public interface FacturaDao {
    public void guardar(Factura factura);
    public void buscarFactura(String numeroFactura);
    public void buscarDescripcion(String descripcion);
}
