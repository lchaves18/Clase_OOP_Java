package com.ucreativa.oop.presupuesto.entidades;

import java.util.ArrayList;
import java.util.List;

public class RegistroGastos {

    List <Gasto> gastos ;

    //constructor
    public RegistroGastos (){
        this.gastos = new ArrayList<>();

    }
    //metodo uno
    public List<Gasto> getGastos(){
        return this.gastos;
    }
    //metodo para agregar gastos
    public void addGastos(Gasto item){
        this.gastos.add(item);

    }

}
