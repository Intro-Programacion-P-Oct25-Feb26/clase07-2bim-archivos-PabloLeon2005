package lectura05; //

public class Principal { //
    public static void main(String args[]) {
        Estadistica est = new Estadistica();
        
        double resultado = est.obtenerPromedioEmpleados("data/sucursales.txt"); 
        
        System.out.println("El promedio de empleados es: " + resultado); //
    }
}