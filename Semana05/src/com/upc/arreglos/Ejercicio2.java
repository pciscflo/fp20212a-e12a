package com.upc.arreglos;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] edades = new int[5];
        edades[0]=20;
        edades[1]=22;
        edades[2]=30;
        edades[3]=18;
        edades[4]=40;
        //edades[5]=10; no es posible
        System.out.println(edades.length);//5
        for(int i=0; i<edades.length;i++){
            System.out.println(edades[i]);
        }
    }
}
