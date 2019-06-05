/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido;

import org.pedido.estadoPedido.EstadoPedido;

/**
 *
 * @author amx_c
 */
//Se usa el Extends para hacer conexión con otras clases. ÉSto agrega un Import y crea el super.
public class Pedido extends EstadoPedido{
    
    private String numeroPedido; 
    private String fechaCreacion;
    private String fechaEntrega;
    private String direccion;
    private String repartidor;
    private String estadoPedido;
    private String nombreCliente;
    private String telefonoCliente;
    private String tipoEntrega;
    private String detallePedido; 

    public Pedido(String nombre, String descripcion) {
        super(nombre, descripcion);
    }
}
