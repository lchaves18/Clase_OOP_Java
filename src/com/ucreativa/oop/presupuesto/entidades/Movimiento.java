package com.ucreativa.oop.presupuesto.entidades;

import java.util.Date;

public abstract class Movimiento {

    private String nombre;
    private String moneda;
    private String categoria;
    private int monto;
    private Date fecha;

    //constructor
    public Movimiento(String nombre,
                      String moneda,
                      String categoria,
                      int monto){

        this.nombre = nombre;
        this.moneda = moneda;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = new Date();

    }

    //este metodo es el abstracto
    public abstract String getDetails();

    // defaults Gets
    String getNombre(){
        return this.nombre;
    }

    String getMoneda() {
        return moneda;
    }

    String getCategoria() {
        return categoria;
    }

    int getMonto() {
        return monto;
    }

    Date getFecha() {
        return fecha;
    }
}
