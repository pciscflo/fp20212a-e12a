package com.upc.cadenas;

public class Ejercicio1 {
    static String [] candidatos = {"KF","PK","CA","AG","JG","AT"};

    static String [] resultados= {  "KF","KF","KF","KF","KF","KF",
                                    "PK","PK","PK","PK","PK","PK",
                                    "CA","CA","CA","CA","CA","CA",
                                    "AG","AG","AG","AG","AG","AG",
                                    "JG","JG","JG","JG","JG","JG",
                                    "AT","AT","AT","AT","AT","AT"};

    static String [] hojavida= {"EL","FA","CP","IR","RS","PG",
                                "EL","FA","CP","IR","RS","PG",
                                "EL","FA","CP","IR","RS","PG",
                                "EL","FA","CP","IR","RS","PG",
                                "EL","FA","CP","IR","RS","PG",
                                "EL","FA","CP","IR","RS","PG"};

    static int [] puntaje = {350,122,431,101,341,78,
                             450,121,452,123,111,345,
                             123,123,431,124,153,231,
                             321,145,651,138,765,132,
                             333,111,222,444,555,123,
                             451,453,431,467,454,344};

    public int obtenerPuntajeCandidato(String codigo){
        int suma = 0;
        for(int i=0; i<resultados.length;i++){
            if(codigo.equals(resultados[i])){
                suma += puntaje[i];
            }
        }
        return suma;
    }

    public static void main(String[] args) {


    }
}
