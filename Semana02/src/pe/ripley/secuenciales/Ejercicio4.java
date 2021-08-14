package pe.ripley.secuenciales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final int MAXIMO = 100;
        Scanner sc = new Scanner(System.in);
        double radio, area;
        System.out.println("Ingresar radio:");
        radio = sc.nextDouble();
        area = Math.PI*Math.pow(radio, 2);//radio al cuadrado
        System.out.printf("Resultado:%.2f\n", area);
        System.out.println("Mi constante: " + MAXIMO);
    }
}
