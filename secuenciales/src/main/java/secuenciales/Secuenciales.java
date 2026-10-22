/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package secuenciales;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Secuenciales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double centigrados, fahrenheit;
        
        System.out.print("Escriba la temperatura en Centigrados:");
        centigrados = entrada.nextDouble();
        
        fahrenheit = (centigrados*9/5)+32;
        
        System.out.println("La temperatura en grados fahrenheit es:"+fahrenheit);
        
        
        
    }
}
