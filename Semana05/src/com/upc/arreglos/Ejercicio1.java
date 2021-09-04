package com.upc.arreglos;

public class Ejercicio1 {
    public static void main(String[] args) {
         final int N=100;
         String[] nombres = new String[N];
         double[] estaturas = new double[N];
         nombres[0] = "Luis";
         estaturas[0] = 1.68;
         //Ejemplo de Notas de alumnos con su respectivo apellidos
        int[] notas = {19,20,17,15};
        String apellidos[] = {"Torres", "Lopez", "Perez", "Loo"};
        System.out.println("Promedio de notas:" + calcularPromedio(notas));
        System.out.println("Apellido con mas nota:" + obtenerApellidoAlumnoMayorNota(notas,apellidos));

    }
    public static double calcularPromedio(int[] notas){
        int suma = 0;
       for(int i=0; i<notas.length ;i++){ // length calcula el tamaño del arreglo contado desde 1
           suma+=notas[i];
       }
       return 1.0*suma/notas.length;
    }

    public static String obtenerApellidoAlumnoMayorNota(int[]notas, String[] apellidos) {
        String ap = null;
        int maximo = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maximo) {
                maximo = notas[i];
                ap = apellidos[i];
            }
        }
        return ap;//maximo
    }
}
