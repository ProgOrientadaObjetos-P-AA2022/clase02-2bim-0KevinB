
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

public class Ejecutor2 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numAsignaturas = 5;
        double costoAsig = 50.5;
        
                
        EstudiantePresencial estDistancia = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numAsignaturas, costoAsig);
        
        estDistancia.calcularMatriculaPresencial();
        
        System.out.println(estDistancia);
    }
}
