package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.repo.InterfaceRepository;

import java.io.*;
import java.util.stream.Collectors;

public class ImplementacionRegistro implements InterfaceRegistro {

    private InterfaceRepository repository;

    public ImplementacionRegistro(InterfaceRepository repository){

        this.repository = repository;

    }
    @Override
    public boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) {

        int monto;
        try{
            monto = Integer.parseInt(montoStr);
        }catch (NumberFormatException ex){

            System.out.println("Formato invalido en ("+montoStr+"):" + ex.getMessage());
            return false;
        }
        Ingreso ingreso = new Ingreso(nombre,
                moneda,
                categoria,
                monto,
                periodicidad);
        return this.repository.save(ingreso.getDetails());
    }

    @Override
    public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) {

        int monto = Integer.parseInt(montoStr);
        Gasto gasto = new Gasto(nombre,
                moneda,
                categoria,
                monto);

        return this.repository.save(gasto.getDetails());
    }

    @Override
    public void getMovimientos() {
        this.repository.read();
    }
    @Override
    public void getGastos() {
        this.repository.read();
    }
}
