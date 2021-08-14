package pe.ripley.secuenciales;

import java.util.Scanner;

public class Ejercicio5 {
    public static double calcularArea(double radio){
        double area;
        area = Math.PI*Math.pow(radio, 2);
        return area;
    }
    public static void main(String[] args) {
        double x, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese radio:");
        x = sc.nextDouble();//leyendo radio del teclado
        area = calcularArea(x);
        System.out.println("Area: " + area);
    }
}
