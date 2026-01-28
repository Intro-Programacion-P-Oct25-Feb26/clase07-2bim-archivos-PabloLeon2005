/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura03.lectura04;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Body {

    public static void imprimir() {

        double sumaTotal = 0;
        int contador = 0;

        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);

                
                    String valor = linea_partes.get(3); 
                    double valorNumerico = Double.parseDouble(valor);

                    sumaTotal = sumaTotal + valorNumerico;
                    contador = contador + 1;
                                    
            } 
            entrada.close();

            if (contador > 0) {
                double promedio = sumaTotal / contador;
                System.out.printf("El promedio es:%.2f ", 
                         promedio);
            } else {
                System.out.println("No se encontraron valores.");
            }

        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1); 
        } 
    }
}
    

