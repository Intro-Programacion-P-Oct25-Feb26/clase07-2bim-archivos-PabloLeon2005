package lectura02;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeerArchivoTexto {
    
    // lee registro del archivo
    public static void leerRegistros() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                // El doble \\ se lo usa cuando le método de separación o split
                // será diferente de "," y ";" por ejemplo el "|" se lo usa así
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                
                
                System.out.printf("%s\n", linea_partes.get(0));
                System.out.printf("%s\n", linea_partes.get(1));
                System.out.printf("%s\n", linea_partes.get(2));
                System.out.printf("%s\n", linea_partes.get(3));
                System.out.println("");

            } // fin de while
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    
} // fin de la clase LeerArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 
 *************************************************************************/
