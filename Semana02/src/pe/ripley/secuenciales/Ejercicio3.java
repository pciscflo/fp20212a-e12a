package pe.ripley.secuenciales;

import java.util.Scanner;

public class Ejercicio3 {
    //método o funcion (procedimiento) o modulo
    public static double calcularArea(double a, double b, double c){
        double area1 = (a - c) * b /2.0;
        double area2 = b*c ;
        double areatotal = area1 + area2;
        return areatotal;
    }
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado A:");
        a = sc.nextDouble();
        System.out.println("Ingrese el lado B:");
        b = sc.nextDouble();
        System.out.println("Ingrese el lado C:");
        c = sc.nextDouble();
        double area;
        area = calcularArea(a, b, c);
        System.out.println("Resultado:" + area);

    }
}
