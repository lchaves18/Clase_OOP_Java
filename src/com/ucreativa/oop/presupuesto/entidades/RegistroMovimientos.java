package com.ucreativa.oop.presupuesto.entidades;

import java.util.ArrayList;
import java.util.List;

public class RegistroMovimientos {

    List <Movimiento> movimientos ;

    //constructor
    public RegistroMovimientos(){
        this.movimientos = new ArrayList<>();

    }
    //metodo uno
    public List<Movimiento> getMovimientos(){

        return this.movimientos;
    }
    //metodo para traerme solo los gastos
    public List<Gasto> getGastos(){

        List<Gasto> respuesta = new ArrayList<>(); //creo una lista de gasto que voy a retornar

        for (Movimiento movimiento : this.movimientos){ //recorro todos los elementos de Movimientos

            if (movimiento instanceof Gasto){
                respuesta.add((Gasto) movimiento);

            }

        }
        return respuesta;
    }

    //metodo 2 para agregar gastos
    public void addMovimiento(Movimiento item){
        this.movimientos.add(item);

    }

}
