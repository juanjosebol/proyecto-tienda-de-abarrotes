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
public class empleado {
    
    private String nombre;
    private String dias_de_trabajo;
    private String puesto;
    private String estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDias_de_trabajo() {
        return dias_de_trabajo;
    }

    public void setDias_de_trabajo(String dias_de_trabajo) {
        this.dias_de_trabajo = dias_de_trabajo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
