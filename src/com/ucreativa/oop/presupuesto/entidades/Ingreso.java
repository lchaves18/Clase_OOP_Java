package com.ucreativa.oop.presupuesto.entidades;

public class Ingreso extends Movimiento {

    private String periodicidad;

    //constructor
    public Ingreso (String nombre,
                    String moneda,
                    String categoria,
                    int monto,
                    String periodicidad){
        super(nombre, moneda,categoria,monto); /*referencio al constructor de la
                                                clase padre juntos con los parametros que este recibe*/

        this.periodicidad=periodicidad;
    }

    @Override
    public String getDetails() {
        return "INGRESO:" + this.getNombre() + " - " +
                this.getMoneda() + " - " +
                this.getCategoria() + " - " +
                this.getMonto() + " - " +
                this.periodicidad;
    }
}
