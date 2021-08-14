package pe.ripley.secuenciales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado A:");
        a = sc.nextDouble();
        System.out.println("Ingrese el lado B:");
        b = sc.nextDouble();
        System.out.println("Ingrese el lado C:");
        c = sc.nextDouble();
        double area1 = (a - c) * b /2.0;
        double area2 = b*c ;
        double areatotal = area1 + area2;
        System.out.println("El resultado es:" + areatotal);

    }
}
