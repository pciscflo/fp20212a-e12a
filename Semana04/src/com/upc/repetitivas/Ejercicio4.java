package com.upc.repetitivas;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // suma =   1/2 + 1/4 + 1/6 + ...n términos
        Scanner sc = new Scanner(System.in);
        int contadorTerminos = 0, n;
        double suma = 0;  // v = v + cte ===>  v+=cte
        System.out.println("Ingrese n:");
        n = sc.nextInt();
        for(int i=2; contadorTerminos<n  ;i+=2){//4,6
          suma = suma + 1.0/i; // 1/2+1/4
          contadorTerminos++; // contadorTerminos = contadorTerminos + 1 //1,2
        }
        System.out.println("Suma:"+ suma);

    }
}
