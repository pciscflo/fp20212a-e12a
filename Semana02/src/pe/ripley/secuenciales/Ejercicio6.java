package pe.ripley.secuenciales;

import java.util.Scanner;

public class Ejercicio6 {

    public static double calcularSueldoFinal(int horas, double tarifaHora){
        double descuento;
        double sueldoInicial, sueldoFinal;
        sueldoInicial = horas * tarifaHora;
        descuento = sueldoInicial*0.10;
        sueldoFinal = sueldoInicial - descuento;
        return sueldoFinal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;
        double tarifa;
        System.out.println("Ingrese Horas:");
        horas = sc.nextInt();
        System.out.println("Ingrese Tarifa:");
        tarifa = sc.nextDouble();
        System.out.println("Sueldo Final: "+
                           calcularSueldoFinal(horas,tarifa));//pruebas unitarias
    }
}
