package com.ucreativa.oop.presupuesto.repo;

import com.ucreativa.oop.presupuesto.entidades.Movimiento;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements  InterfaceRepository{


    List<String> movimientos;

    public InMemoryRepository(){
        movimientos = new ArrayList<>();

    }
    @Override
    public boolean save(String text) {

        movimientos.add(text);
        return true;

    }
    @Override
    public void read() {

        for(String item : this.movimientos){

            System.out.println(item);
        }
    }
}
