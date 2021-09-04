package com.upc.arreglos;

public class Ejercicio3 {
    public static void main(String[] args) {
        double[] pesos =    { 23,     45,      12 ,   45  }; //kilos
        String[] paquetes = {"A111", "B223", "W231", "R567"};
        for(int i=0; i < pesos.length;i++){
            System.out.println(paquetes[i]+ "   " + pesos[i]);
        }
        System.out.println("-------------------------");
        //Imprimir un listado de paquetes que pesen menos de 30 kilos
        String[] paq = obtenerPaquetesMenos30Kilos(pesos, paquetes);//llamamos al método
        for(int i=0; i< paq.length;i++){
            System.out.println(paq[i]);
        }
    }
    //metodo que "retorna un arreglo" que contiene los nombres de los paquetes que pesan menos de 30
    public static String[] obtenerPaquetesMenos30Kilos(double[] pesos, String[] paquetes){
        String[] temporalPaquetes = new String[pesos.length];//datos son nulos
        int j=0;//contador de paquetes que pesan menos de 30 kilos, sirve para el temporal
        for(int i=0; i<pesos.length;i++){
            if(pesos[i]<30){
                temporalPaquetes[j] = paquetes[i];
                j++;
            }
        }
        return temporalPaquetes;
    }

}
