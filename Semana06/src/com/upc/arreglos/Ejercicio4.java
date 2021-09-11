package com.upc.arreglos;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] codigos = {"AR000101", "PE125610", "CH452315", "BR521317", "BR123620", "PE752124",
        "AR124511", "PE562405", "PE562405", "BR452102", "AR455210"};
        System.out.println("Cantidad de Productos:" + obtenerCantidadProductos("PE",codigos));
        System.out.println("Maximo Correlativo dado pais:" + obtenerMayorCorrelativo("BR", codigos));
        System.out.println("Costo de almacenaje dado pais:" + obtenerCostoAlmacenaje("PE",codigos));
    }
    public static int obtenerCantidadProductos(String nacionalidad,String[] codigos){
        int contador=0;
        for(int i=0; i<codigos.length;i++){
            if(codigos[i].substring(0,2).equals(nacionalidad)){
                contador++;
            }
        }
        return contador;
    }
    public static int obtenerMayorCorrelativo(String nacionalidad, String[] codigos){
        int maximo = 0;
        for(int i=0; i<codigos.length;i++){
            if(Integer.parseInt(codigos[i].substring(2,6)) > maximo && codigos[i].substring(0,2).equals(nacionalidad)){
                maximo = Integer.parseInt(codigos[i].substring(2,6));
            }
        }
        return maximo;
    }
    public static int obtenerCostoAlmacenaje(String nacionalidad, String[] codigos){
        int suma = 0;
        for (int i=0; i< codigos.length;i++){
            if (codigos[i].substring(0,2).equals(nacionalidad)){
                suma += Integer.parseInt(codigos[i].substring(6,8));
            }
        }
        return suma;
    }
}
