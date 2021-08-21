package com.upc.selectivas;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println(queTipo(20));
        System.out.println(queTipo(0));
    }
    public static String queTipo(int a){
        String resultado;
        if(a>0){
            resultado = "Positivo";
        }else if (a<0){
            resultado = "Negativo";
        }else{
            resultado = "Cero";
        }
        return resultado;
    }
}
