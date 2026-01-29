/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author PC
 */
public class Body {

    public static void agregarDatos(String valor, String placa) {
       
        String letra = placa.substring(0, 1).toUpperCase();
        String nombreArchivo;

        if (letra.equals("L")) {
            nombreArchivo = "data/loja.txt";
        } else if (letra.equals("P")) {
            nombreArchivo = "data/pichincha.txt";
        } else if (letra.equals("G")) {
            nombreArchivo = "data/guayas.txt";
        } else {
            nombreArchivo = "data/otros.txt";
        }

        try {
            FileOutputStream fos = new FileOutputStream(nombreArchivo, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", valor);
            
            salida.close(); 

        } catch (Exception e) {
            System.err.println("Error al crear el archivo: ");
        }
    }
}