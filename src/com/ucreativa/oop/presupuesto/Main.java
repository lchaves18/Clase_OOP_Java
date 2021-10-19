package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionRegistro;
import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionSuperDummy;
import com.ucreativa.oop.presupuesto.logicaNegocio.InterfaceRegistro;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);

        boolean siga = true;

        System.out.println("Que quiere usar? Fake? (F)");

        InterfaceRegistro registro ;
        if (consola.nextLine().equals("F")){

           registro = new ImplementacionSuperDummy();

        }else{

            registro = new ImplementacionRegistro();
        }

        while (siga){

            System.out.println("Digite el nombre de su movimiento:");
            String nombre = consola.nextLine();

            System.out.println("Digite la moneda:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoria de su movimiento:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su movimiento:");
            String montoStr = consola.nextLine();


            System.out.println("Indique si es un gasto (S):");
            if (consola.nextLine().equals("S")){

                registro.addGasto(nombre,
                        moneda,
                        categoria,
                        montoStr);

            }else {

                System.out.println("Indique la periodicidad del ingreso:");
                String periodicidad = consola.nextLine();

                registro.addIngreso(nombre,
                        moneda,
                        categoria,
                        montoStr,
                        periodicidad);
            }

            System.out.println("Todos los movimientos:");
            registro.getMovimientos();

            System.out.println("Solo Gastos");
            registro.getGastos();

            System.out.println("Quiere seguir?('S')");
            siga = consola.nextLine().equals("S"); //validacion para ver si "siga" es true o false


        }

    }
}
