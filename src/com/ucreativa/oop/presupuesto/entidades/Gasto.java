package com.ucreativa.oop.presupuesto.entidades;

public class Gasto extends Movimiento{

    //constructor
    public Gasto (String nombre,
                  String moneda,
                  String categoria,
                  int monto){

        super (nombre,moneda,categoria,monto);

    }

    @Override
    public String getDetails() {
        return "GASTO:" + this.getNombre() + " - " +
                this.getMoneda() + " - " +
                this.getCategoria() + " - " +
                this.getMonto();
    }

}
