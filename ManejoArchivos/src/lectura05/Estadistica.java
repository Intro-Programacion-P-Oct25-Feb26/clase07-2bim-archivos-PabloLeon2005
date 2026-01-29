package lectura05; //

import java.io.File;
import java.util.Scanner;

public class Estadistica { //

    public double obtenerPromedioEmpleados(String nombreArchivo) { //
        double suma = 0;
        int contadorRegistros = 0;

        try {
            File archivo = new File(nombreArchivo);
            Scanner lector = new Scanner(archivo); // CORRECCIÓN: Se pasa el archivo, no el String

            if (lector.hasNextLine()) {
                lector.nextLine(); // Salta la cabecera: nombre|empresa|empleados...
            }

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();

                try {
                    String[] datos = linea.split("\\|");
                    
                    // Instrucción 5: Validar si la línea es incompleta
                    if (datos.length < 5) {
                        throw new Exception("Línea incompleta: " + linea); //
                    }
                    
                    // Posición [2] es la columna 'empleados'
                    int empleados = Integer.parseInt(datos[2].trim());

                    suma += empleados;
                    contadorRegistros++;

                } catch (Exception e) {
                    // Instrucción 6: El catch permite seguir dentro del while para las siguientes lecturas
                    System.out.println("Error procesando registro: " + e.getMessage()); //
                }
            }
            lector.close();

        } catch (Exception e) {
            System.out.println("Error crítico al leer el archivo: " + e.getMessage());
        }

        return (contadorRegistros > 0) ? (suma / contadorRegistros) : 0;
    }
}