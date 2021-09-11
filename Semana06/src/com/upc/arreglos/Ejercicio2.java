package com.upc.arreglos;

public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena = "Francisco";
        System.out.println(cadena.substring(0,1));//0,0+1  F
        System.out.println(cadena.substring(8,9));//8, 8+1  o
        System.out.println(cadena.substring(2,3));//2, 2+1  a
        System.out.println(cadena.substring(4,9));  //"cisco" 4, 4 + 5
        // poisicion_inicial, posicion_inicial + cantidad caracteres a desplazarse incluye la pos. inicial
        String codigo = "2021000512345678";
        System.out.println(codigo.substring(8, 8 + 8));//12345678
        System.out.println(codigo.substring(0,0+4));//2021
        String frase = "Los amigos del barrio";//se cuentan los espacios
        System.out.println(frase.substring(4,4+6));//amigos
        String marca = "888ddMMyyPERU0001";
        System.out.println(marca.substring(9,9+4));//PERU
        System.out.println(marca.substring(9,13));//PERU

    }
}
