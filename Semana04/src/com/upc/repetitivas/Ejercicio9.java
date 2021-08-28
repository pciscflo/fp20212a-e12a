package com.upc.repetitivas;

public class Ejercicio9 {
    /*
 Una empresa tiene como reglamento dar aumento de sueldo a sus trabajadores
 todos los años, el porcentaje de aumento está dado de acuerdo con el tipo
 de trabajador: Gerente (g) o empleado (e). Los gerentes reciben un aumento
 del 14% anual y los empleados reciben el 8% anual. Cada 4 años en vez de 14%
 reciben 18% y en vez de 8% reciben 12% (dependiendo del tipo de trabajador).
 Desarrollar los módulos que determinen el sueldo que tendrá un trabajador
 después de N años y el porcentaje de aumento de sueldo que ha obtenido
 comparando su sueldo original y su sueldo después de N años. Tenga en cuenta
 que los aumentos obtenidos van a su sueldo.
 Se le solicita lo siguiente:
   a.	Cálculo del sueldo después de N años
   b.	Calcular el porcentaje de aumento después de N años.
 */
    public static void main(String[] args) {
        //entrada n numero de años, sueldo, cargo (g, e)
        // salida : sueldo final al cabo de n años
        int n=10;
        double sueldo=500;
        String cargo="g";
        double sueldofinal, porcentajeFinal;
        sueldofinal = calcularSueldoFinalTrabajador(n, sueldo,cargo);
        System.out.println("Sueldo Final:" + sueldofinal); //800 -- > (500/800)x100
        porcentajeFinal = calcularPorcentajeAumento(sueldo,sueldofinal);
        System.out.println("Porcentaje de Aumento:" + porcentajeFinal);
    }
    public static double calcularPorcentajeAumento(double sueldoInicial, double sueldoFinal){
        double porcentaje;
        porcentaje = (sueldoInicial / sueldoFinal)*100;
        return porcentaje;
    }
    public static double calcularSueldoFinalTrabajador(int n, double sueldo, String cargo) {
        double porcentajeAumento = 0;//variable local, temporal al metodo
        for (int i = 1; i <= n; i++) { //for 1,2,....,n
            switch (cargo) {
                case "g":
                    if (i % 4 == 0) {
                        porcentajeAumento = 0.18;
                    } else {
                        porcentajeAumento = 0.14;
                    }
                    break; //SALE DEL SWITCH O FOR O WHILE O DO WHILE
                case "e":
                    if (i % 4 == 0) {
                        porcentajeAumento = 0.12;
                    } else {
                        porcentajeAumento = 0.08;
                    }
                    break;
            } //fin del for
            sueldo = sueldo + porcentajeAumento * sueldo;
        }
        return sueldo;
    }
}
