/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura02;

/**
 *
 * @author PC
 */
public class Demo {

    public static void main(String args[]) {
        String variableA = "100.2";
        String variableB = "200.2";

        double variableC = Double.parseDouble(variableA);
        double variableD = Double.parseDouble(variableB);
        double x = variableC + variableD;
        
        System.out.printf("%.2f", x);

    }
}
