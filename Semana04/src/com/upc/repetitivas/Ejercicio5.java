package com.upc.repetitivas;

public class Ejercicio5 {
    /*
    El sueldo de una trabajador se inicia en 500 soles
    y en cada mes se incrementa en 20%.
    Cuanto meses pasará para que gane por lo menos 1500 soles?
     */
    public static void main(String[] args) {
        double sueldo = 500;//primer mes
        int meses =1;
        for(   ; sueldo <=1500;  ){
           sueldo = sueldo + 0.20*sueldo;//segundo mes
            meses++;//2 meses++ = meses = meses + 1
        }
        System.out.println("Meses:" + meses);

    }
}
