/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.formaDePago;

/**
 *
 * @author Gonzalo
 */
public class FormaDePago {
    private String TarjetaDeCredito;
    private String Efectivo;
    private String Debito;

    public FormaDePago(String TarjetaDeCredito, String Efectivo, String Debito) {
        this.TarjetaDeCredito = TarjetaDeCredito;
        this.Efectivo = Efectivo;
        this.Debito = Debito;
    }

    public String getTarjetaDeCredito() {
        return TarjetaDeCredito;
    }

    public void setTarjetaDeCredito(String TarjetaDeCredito) {
        this.TarjetaDeCredito = TarjetaDeCredito;
    }

    public String getEfectivo() {
        return Efectivo;
    }

    public void setEfectivo(String Efectivo) {
        this.Efectivo = Efectivo;
    }

    public String getDebito() {
        return Debito;
    }

    public void setDebito(String Debito) {
        this.Debito = Debito;
    }
    
    
}
