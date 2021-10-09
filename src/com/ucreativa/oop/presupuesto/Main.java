package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.RegistroGastos;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema Registro de Gastos");
        Scanner consola = new Scanner(System.in);

        RegistroGastos registro = new RegistroGastos();

        boolean siga = true;
        while (siga){

            System.out.println("Digite el nombre de su gasto:");
            String nombre = consola.nextLine();

            System.out.println("Digite la moneda:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoria de su gasto:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);

            Gasto nuevoGasto = new Gasto(nombre, moneda, categoria, monto);

        /*intancia quemada
        Gasto gastoLuz = new Gasto("Luz",
                "Colones",
                "Servicios",
                22000);*/

        /*Gasto gastoInternet = new Gasto("Internet",
                "Colones",
                "Servicios",
                35000);*/



            registro.addGastos(nuevoGasto);

            //registro.addGastos(gastoInternet);
            // System.out.println("Mi gasto de " + gastoLuz.nombre + " es de " + gastoLuz.monto + " " + gastoLuz.moneda); imprime uno por uno

            /*
            for (int i = 0; i < registro.getGastos().size(); i++) {
                System.out.println(registro.getGastos().get(i).getNombre());

            }*/

            for (Gasto gastico : registro.getGastos()) {
                System.out.println(gastico.getNombre());
            }

            System.out.println("Quiere seguir?('S')");
            siga = consola.nextLine().equals("S"); //validacion para ver si "siga" es true o false


        }

    }
}
