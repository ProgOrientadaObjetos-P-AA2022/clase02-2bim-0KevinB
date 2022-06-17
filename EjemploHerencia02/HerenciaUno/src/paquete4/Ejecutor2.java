/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;

        EstudiantePresencial estP = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        estP.establecerCostoCredito(50);
        estP.establecerNumeroCreditos(4);
        estP.calcularMatriculaPresencial();
        System.out.println(estP);
    }
}
