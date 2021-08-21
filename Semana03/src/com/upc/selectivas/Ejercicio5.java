package com.upc.selectivas;

import java.util.Scanner;

public class Ejercicio5 {
    public static final double PRECIO_TALLER = 500;

    public static void main(String[] args) {
       int cantidadTalleres, cantidadReferidos;
        Scanner sc = new Scanner(System.in);
        cantidadTalleres = 4;
        cantidadReferidos = 10;
        System.out.println(calcularDescuentoNroTalleres(cantidadTalleres));

    }

    public static double calcularDescuentoNroTalleres(int cantidadTalleres){
        double porcentaje=0, descuento;
        if(cantidadTalleres>=2 && cantidadTalleres<=4){
            porcentaje = 0.05;
        } else if (cantidadTalleres>=5 && cantidadTalleres<=7){
            porcentaje = 0.10;
        } else if (cantidadTalleres>=8 && cantidadTalleres<=10){
            porcentaje = 0.15;
        }
        descuento = porcentaje*PRECIO_TALLER*cantidadTalleres;
        return descuento;
    }

    public static double calcularDescuentoReferidos(int cantidadReferidos, int cantidadTalleres){
        double porcentaje=0, descuento;
        if(cantidadReferidos>=2 && cantidadReferidos<=5){
            porcentaje = 0.07;
        } else if (cantidadReferidos>=6 && cantidadReferidos<=8){
            porcentaje = 0.10;
        } else if (cantidadReferidos>=9 && cantidadReferidos<=10){
            porcentaje = 0.12;
        }
        descuento = porcentaje*PRECIO_TALLER*cantidadTalleres;
        if (cantidadReferidos==9 || cantidadReferidos==10){
            descuento = descuento + 20;
        }
        return descuento;
    }
    public static double calculareDescuentoTotal(int cantidaTalleres, int cantidadReferidos){
         double descuento = 0;
         descuento = calcularDescuentoNroTalleres(cantidaTalleres) +
                 calcularDescuentoReferidos(cantidadReferidos, cantidaTalleres);
         return  descuento;
    }

}
