package com.upc.selectivas;

import java.util.Scanner;

public class Ejercicio3 {
    public static String elijeColor(int opcion){
        String color;
       switch (opcion){
           case 1:
               color = "Verde";
               break;
           case 2:
               color = "Amarillo";
               break;
           case 3:
               color = "Rojo";
               break;
           default:
               color = "Negro";
               break;
       }
       return color;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese opcion:");
        opcion = sc.nextInt();
        System.out.println(elijeColor(opcion));

    }
}
