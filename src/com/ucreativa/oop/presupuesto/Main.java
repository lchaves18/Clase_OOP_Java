package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;
import com.ucreativa.oop.presupuesto.entidades.RegistroMovimientos;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);

        RegistroMovimientos registro = new RegistroMovimientos();

        boolean siga = true;
        while (siga){

            System.out.println("Digite el nombre de su movimiento:");
            String nombre = consola.nextLine();

            System.out.println("Digite la moneda:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoria de su movimiento:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su movimiento:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);

            Movimiento nuevoMovimiento;


            System.out.println("Indique si es un gasto (S):");
            if (consola.nextLine().equals("S")){

                nuevoMovimiento = new Gasto(nombre,
                        moneda,
                        categoria,
                        monto);

            }else {

                System.out.println("Indique la periodicidad del ingreso:");
                String periodicidad = consola.nextLine();

                nuevoMovimiento = new Ingreso(nombre,
                        moneda,
                        categoria,
                        monto,
                        periodicidad);
            }

            registro.addMovimiento(nuevoMovimiento);


            System.out.println("Todos los movimientos:");
            for (Movimiento movimientos : registro.getMovimientos()) {
                System.out.println(movimientos.getNombre());
            }


            System.out.println("Solo Gastos");
            for (Movimiento gastico : registro.getGastos()) {
                System.out.println(gastico.getNombre());
            }

            System.out.println("Quiere seguir?('S')");
            siga = consola.nextLine().equals("S"); //validacion para ver si "siga" es true o false


        }

    }
}
