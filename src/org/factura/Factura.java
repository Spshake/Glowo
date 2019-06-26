/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.factura;

import org.pedido.detallePedido.DetallePedido;
import org.pedido.formaDePago.FormaDePago;
import org.persona.cliente.Cliente;
import org.persona.empresa.Empresa;
import org.visual.TipoPedido;

/**
 *
 * @author Gonzalo
 */
public class Factura {
    private String numeroFactura;
    //Asociación
    /*
    private Cliente cliente;
    */
    
    public Factura(String numeroFactura, String fecha, String descripcion, String tipoDeFactura) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipoDeFactura = tipoDeFactura;
        
        /*Composición
        Cliente cliente(nombre);
        */
        /*Agregación
        Cliente cliente;*/
        Cliente cliente;
        Empresa empresa;
        DetallePedido detallepedido;
        FormaDePago formadepago;
        
    }
    
    private String tipoDeFactura;
    private String fecha;
    private String descripcion;

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    
    public String getTipoDeFactura() {
        return tipoDeFactura;
    }

    public void setTipoDeFactura(String tipoDeFactura) {
        this.tipoDeFactura = tipoDeFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
