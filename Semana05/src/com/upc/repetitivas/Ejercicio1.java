package com.upc.repetitivas;

import java.util.Scanner;

public class Ejercicio1 {
    /*
       Desarrollar el siguiente método:
       1) Que reciba un número positivo entero y retorne la suma de sus dígitos
     */
    public static int sumarDigitos(int numero){//234
        int digito, suma = 0;
        while(numero>0){
          digito = numero % 10; //4,3, 2
          suma+=digito;//suma = suma + digito 4 + 3 + 2
          numero = numero / 10; //23, 2, 0
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese numero:");
        numero = sc.nextInt();
        System.out.println("suma de digitos:"+ sumarDigitos(numero));

    }
}
