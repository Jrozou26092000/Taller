/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Juanes
 */
public class Vehiculo {
    private String placas;
    private Hora ingreso;
    private Hora salida;

    public void VehiculoCompleto(String placas, Hora ingreso, Hora salida) {
        this.placas = placas;
        this.ingreso = ingreso;
        this.salida = salida;
    }

    public Vehiculo(String placas) {
        this.placas = placas;
    }
    
    public void VehiculoIngreso(String placas, Hora ingreso) {
        this.placas = placas;
        this.ingreso = ingreso;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public Hora getIngreso() {
        return ingreso;
    }

    public void setIngreso(Hora ingreso) {
        this.ingreso = ingreso;
    }

    public Hora getSalida() {
        return salida;
    }

    public void setSalida(Hora salida) {
        this.salida = salida;
    }
    
}
