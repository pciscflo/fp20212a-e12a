package com.upc.repetitivas;

public class Ejercicio1 {
    public static void main(String[] args) {
        for(int i=0; i<10; i=i+1){
            System.out.println(i);
        }
        System.out.println("************");
        int suma = 0; //acumulador, sumador
        for(int i=0; i<=10; i= i+ 2){//2,4,6,8,10,12
            suma = suma + i;//0+2+4+6+8+10=30
        }
        System.out.println("Resultado:" + suma);
    }
}
