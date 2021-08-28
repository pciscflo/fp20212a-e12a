package com.upc.repetitivas;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // suma = 1 + 4 + 7 +........n términos
        int n, contadorTerminos=1, suma=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n:");
        n = sc.nextInt();//2
        for(int i=1; contadorTerminos<=n; i=i+3){//1,4   var = var + cte ---> contador
            //calcule la suma....
            contadorTerminos = contadorTerminos + 1;//2,3
            suma = suma + i;//1+4  // var = var + variable  (acumulador)
        }
        System.out.println(suma);

    }
}
