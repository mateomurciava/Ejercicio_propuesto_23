/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_propuesto_23;
public class Ejercicio_propuesto_23 {
    
    double A;
    double B;
    double C;
    double x1;
    double x2;
    double x;
    double discriminante;

    
    Ejercicio_propuesto_23(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    String Calcular() {
    discriminante = B * B - 4 * A * C;
    if (discriminante > 0) {
        // Dos soluciones reales distintas
        x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
        x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
        return String.format("x1 = %.3f, x2 = %.3f", x1, x2);
    } else if (discriminante == 0) {
        x = -B / (2 * A);
        return String.format("x = %.3f", x);
    } else {
        double parteReal = -B / (2 * A);
        double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * A);
        return String.format("x1 = %.3f + %.3fi, x2 = %.3f - %.3fi", parteReal, parteImaginaria, parteReal, parteImaginaria);
    }
}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    graphic_P23 ventana = new graphic_P23();
    ventana.show(true);


    }
    
}