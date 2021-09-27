package com.ucreativa.oop;

public class Main {

    //void es para que no retorne nada

    static String metodo(String variable){ //paso por parametro lo de la linea 23

        variable = variable + " a todos"; //declaro la variable y le agrego este otro texto

        return variable;

    }

    //Esto es un comentario en linea

    /* esto es un
    comentario en parrafo */

    public static void main(String[] args) {
        // write your code here

        String variable = "Adios";

        variable = metodo(variable); //lo mando para que se pase al metodo tengo que declararlo como en la linea 7

        System.out.println(variable);

        int entero = 1;
        float flotante = 2.5f; //de tipo flotante hay que ponerle el "f" al final
        String cadenaCaracteres = "2";
        Boolean siOno = true;
        Integer entero2 = 2;


        System.out.println(cadenaCaracteres) ; //con este concadena lo de la linea 31
        System.out.println(Integer.parseInt(cadenaCaracteres) + entero); //aca ya convierte el string a entero

        // Condicionales

        if (entero == 2) {

            System.out.println("No entro");

        } else if (entero == 3) {

            System.out.println("No entro");
        } else {

        System.out.println("OK");

    }

        switch (entero){  //es para tener varios casos segun la variable

            case 1:
                System.out.println("pongo lo que quiero que salga");
                System.out.println("puedo tener varias anidadas");
                break;
            default:
                System.out.println("si no entro en ningun case me vengo por aca");
        }

        //Loops

        int i = 0;
        while (i<10){

            System.out.println("Por aqui voy" + i);
            i = i + 1;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("Por aqui va el otro" + j);
        }
    }
}
