package com.upc.repetitivas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // suma = 1 + 4 + 7 +........n términos
        int n, contadorTerminos=0, suma=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n:");
        n = sc.nextInt();
        for(int i=1; contadorTerminos<n; i=i+3){//1,4,7
            //calcule la suma....
            contadorTerminos = contadorTerminos + 1;//1,2
            suma = suma + i;//1+4
        }
        System.out.println(suma);

    }
}
