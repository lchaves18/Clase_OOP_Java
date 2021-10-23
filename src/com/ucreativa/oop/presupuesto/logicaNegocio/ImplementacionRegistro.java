package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionRegistro implements InterfaceRegistro, InterfaceReportes {

    List <Movimiento> movimientos ;

    //constructor
    public ImplementacionRegistro(){
        this.movimientos = new ArrayList<>();

    }

    public void getMovimientos(){

        for (Movimiento movimientos : movimientos) {
            System.out.println(movimientos.getDetails());
        }
    }

    @Override
    public boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) {

        if(!moneda.equals("USD")){

            System.out.println("Moneda no valida");

        }else{

            int monto = Integer.parseInt(montoStr);
            this.movimientos.add(new Ingreso(nombre,
                    moneda,
                    categoria,
                    monto,
                    periodicidad));
        }
        return true;
    }

    @Override
    public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) {

        int monto = Integer.parseInt(montoStr);
        this.movimientos.add(new Gasto(nombre,
                moneda,
                categoria,
                monto));
        return true;
    }

    //metodo para traerme solo los gastos
    public void getGastos(){

        for (Movimiento movimiento : this.movimientos){
            if (movimiento instanceof Gasto){
                System.out.println(movimiento.getDetails());
            }
        }
    }

    @Override
    public void imprimirReporte() {
        for (Movimiento movimiento : this.movimientos){
                System.out.println(movimiento.getDetails());

        }
    }
}
