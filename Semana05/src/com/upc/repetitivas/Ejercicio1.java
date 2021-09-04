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

    public static int sumarDigitos34(int clave){
        int digito, suma = 0, posicion=0;
        while(clave>0){
            posicion++;
            if(posicion == 3 || posicion==4){
                digito = clave % 10;
                suma+=digito;
            }
            clave = clave / 10;
        }
        return suma;
    }

    public static int cantidadDigitos(int clave){
        int digito, contadorDigitos = 0;
        while(clave>0){
            contadorDigitos++;
            clave = clave / 10;
        }
        return contadorDigitos;
    }

    public static boolean validarClave(int clave){
        int digitos = cantidadDigitos(clave);
        int suma = sumarDigitos34(clave);
        if (digitos>=4 && suma % 2 ==0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese numero:");
        numero = sc.nextInt();
        System.out.println("suma de digitos:"+ sumarDigitos(numero));

    }
}
