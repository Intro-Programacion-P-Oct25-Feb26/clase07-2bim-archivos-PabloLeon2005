package escritura05;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        
        boolean continuar = true; 

        while (continuar) {

            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su tipo de vehiculo");
            String vehiculo = entrada.nextLine();
            System.out.println("Ingrese su placa");
            String placa = entrada.nextLine();

            cadenaFinal = String.format("%s %s %s\n",
                    nombre,
                    vehiculo,
                    placa);

            Body.agregarDatos(cadenaFinal, placa);
            
            System.out.println("¿Desea ingresar otro vehículo? (si/no)");
            String respuesta = entrada.nextLine();
            
            if (respuesta.equals("no")) {
                continuar = false; 
            }
        }
        
    }
}