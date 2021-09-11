package com.upc.arreglos;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] codigos = {"2021123456","2018123456","2016123456", "2020123456"};
        System.out.println(codigos[2]);//"2016123456"
        System.out.println(codigos[2].substring(0,4));//2016
        System.out.println("**************************");
        //Imprimir la cantidad de alumnos del 2016
        int contador= 0;
        for (int i=0; i< codigos.length;i++){
            //System.out.println(codigos[i]);
            if(codigos[i].substring(0,4).equals("2016")){
                contador++;
            }
        }
        System.out.println("Cantidad de alumnos del 2016:" + contador);

    }
}
