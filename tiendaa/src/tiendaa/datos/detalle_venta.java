/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaa.datos;

/**
 *
 * @author USUARIO
 */
public class detalle_venta {
    
    private String cantidad_vendida;
    private String precio_total_de_venta;

    public String getCantidad_vendida() {
        return cantidad_vendida;
    }

    public void setCantidad_vendida(String cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }

    public String getPrecio_total_de_venta() {
        return precio_total_de_venta;
    }

    public void setPrecio_total_de_venta(String precio_total_de_venta) {
        this.precio_total_de_venta = precio_total_de_venta;
    }

}
