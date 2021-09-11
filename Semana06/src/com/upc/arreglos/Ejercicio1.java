package com.upc.arreglos;

public class Ejercicio1 {
    /*
   Una empresa vendedora de fotocopiadoras necesita calcular cual ha sido el volumen de ventas de cada uno de sus
   agentes comerciales durante el presente mes y en base a eso determinar distintos indicadores, así como montos
   a pagar en comisión de ventas. Se le solicita:
   a) Obtener el total de unidades vendidas durante el presente mes. Para eso se tiene como dato de entrada un
    arreglo con la cantidad de unidades vendidas por cada agente comercial.
   b) Si se sabe que la cuota de venta de cada vendedor es 5 unidades, determinar cuál es el porcentaje de vendedores
    que superaron la cuota de venta. Para eso se tiene como dato de entrada un arreglo con la cantidad de unidades
     vendidas por cada agente comercial.
   c) Se desea saber quién(es) fueron los agentes de ventas que superaron la cuota de venta.
   d) Si se sabe que por cada unidad vendida se tiene que pagar una comisión de ventas de 300 soles, determinar
    cuánto es lo que se tiene que pagar como comisión este mes.
   */
    public static void main(String[] args) {
        String[] vendedores = {"Carlos", "Freddy", "Marcos", "Susan", "Pedro", "Luis", "Karen"};
        int[] cantidadVentas = {10, 6, 14, 7 ,4, 5, 3};//i=0, 1....
        System.out.println("Total dee unidades vendidas:"+ sumarVentas(cantidadVentas));
        System.out.println("Cantidad de vendedores que superaron la cuota:" +
                cantidadVendedoresSuperaronCuota(cantidadVentas));
        System.out.println("**Vendedores que Superaron Cuota***");
        String[] vendedoreCuota;
        vendedoreCuota = obtenerVendedoresSuperaronCuota(cantidadVentas,vendedores);
        for(int i=0; i<vendedoreCuota.length;i++){
            System.out.println(vendedoreCuota[i]);
        }
        System.out.println("Ventas a pagar:"+sumarVentasAPagar(cantidadVentas));

    }
    public static int sumarVentas(int[] cantidadVentas){
        int suma=0;
        for (int i=0; i < cantidadVentas.length;i++){//1,2,..6,7
            suma+=cantidadVentas[i];//10+6+14....+3
        }
        return suma;
    }
    public static int cantidadVendedoresSuperaronCuota(int[] cantidadVentas){
        int contador=0;
        for(int i=0; i< cantidadVentas.length;i++){
            if (cantidadVentas[i]>=5){
                contador++;
            }
        }
        return contador;
    }
    public static String[] obtenerVendedoresSuperaronCuota(int[] cantidadVentas, String[] vendedores){
        String[] vendedoresSuperaron = new String[cantidadVentas.length]; // no se puede poner variable, en array estatico
        //{"Carlos", "Freddy", "Marcos"", null, null, null, null} //j =
        int j = 0;
        for (int i=0; i< cantidadVentas[i];i++){//0,1,2
            if(cantidadVentas[i]>=5){
                vendedoresSuperaron[j] = vendedores[i];
                j++;//1,2
            }
        }
        //opcional, obtener el arreglo sin espacios vacíos si es que quedan
        String [] arrF = new String[j];
        System.arraycopy(vendedoresSuperaron, 0, arrF, 0, arrF.length);
        return arrF;///lo clásico es que se ponga return temporal;
    }
    public static int sumarVentasAPagar(int[] cantidadVentas){
        int suma=0;
        for (int i=0; i < cantidadVentas.length;i++){//1,2,..6,7
            suma+=cantidadVentas[i]*300;
        }
        return suma;
    }
}
