package com.upc.selectivas;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //ingrese dato examenOral, examenEscrito
        Scanner sc = new Scanner(System.in);
        int examenEscrito, examenOral;
        System.out.println("Ingrese Examen Escrito:");
        examenEscrito = sc.nextInt();
        System.out.println("Ingrese Examen Oral:");
        examenOral = sc.nextInt();
        System.out.println(obtenerNivel(examenEscrito, examenOral));
        System.out.println(obtenerPrecio(examenEscrito, examenOral));//

    }
    public static String obtenerNivel(int examenEscrito, int examenOral){
        String nivel;
        if(examenEscrito > 95 && examenOral>75){
            nivel = "Nivel 3";
        }else if (examenEscrito >95 && examenOral<=75){
            nivel = "Nivel 2";
        }else{
            nivel = "Nivel 1";
        }
        return nivel;
    }
    public static double obtenerPrecio(int examenEscrito, int examenOral){
        String nivel;
        double precio;
        nivel = obtenerNivel(examenOral, examenEscrito);
        switch (nivel) {
            case "Nivel 1":
                precio = 150;
                break;
            case "Nivel 2":
                precio = 250;
                break;
            case "Nivel 3":
                precio = 400;
                break;
            default:
                precio = 0;
                break;
        }
        return precio;
    }


}
