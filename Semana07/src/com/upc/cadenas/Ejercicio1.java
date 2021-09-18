package com.upc.cadenas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] codigos = {"AVIAV1223D", "LANLA0342T", "AARAA0034D", "COPCP0234D", "ASDF123456"};
        double[] descuentos = {300, 900, 1200, 400, 100};
        Scanner scanner = new Scanner(System.in);
        String tipoEntrada, codigoPromocional;
        //Entrada
        System.out.println("Ingrese Tipo Entrada:");
        tipoEntrada = scanner.nextLine();
        System.out.println("Ingrese Codigo Promocional:");
        codigoPromocional = scanner.nextLine();
        codigoPromocional = codigoPromocional.toUpperCase();
        System.out.println("Monto a Pagar:"+calcularMontoFinalPagar(codigoPromocional,tipoEntrada,codigos,descuentos));
    }

    public static double calcularMontoFinalPagar(String codigoPromocional, String tipoEntrada,
                                                 String[] codigos, double[] descuentos){
        boolean valido;
        double descuento, montoSinDescuento, montototal;
        montoSinDescuento = obtenerMontoEntrada(tipoEntrada);
        valido = validarCodigo(codigoPromocional, codigos);
        if(valido){
            descuento = calcularDescuento(codigoPromocional,codigos,descuentos);
            if(descuento>montoSinDescuento){
                return 0;
            }
            montototal = montoSinDescuento - descuento;
            return montototal;
        }else {
            return montoSinDescuento;
        }
    }

    public static double calcularDescuento(String codigoPromocional, String[] codigos, double[] descuentos ){
        for (int i=0; i<codigos.length;i++){
            if (codigoPromocional.equals(codigos[i])){
                return descuentos[i];
            }
        }
        return 0;
    }
    public static boolean validarCodigo(String codigoPromocional, String[] codigos){
          if (codigoPromocional.length()==10){
              for(int i=0; i<codigos.length;i++){
                  if (codigoPromocional.equals(codigos[i])){
                      return true;
                  }
              }
              return false;
          }else{
              return false;
          }
    }
    public static double obtenerMontoEntrada(String tipoEntrada){
        double monto=0;
        switch (tipoEntrada){
            case "normal" :monto = 700;
                break;
            case "silver": monto = 1700;
                break;
            case "gold": monto = 2700;
                break;
        }
        return monto;
    }
}
