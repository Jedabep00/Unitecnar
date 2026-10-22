/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package companijd;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Companijd {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaracion de variable
        double sueldohora,horas,ganancias;
        //Entrada
        System.out.print("digite su sueldo:");
        sueldohora = entrada.nextDouble();
        System.out.print("digite las horas trabajadas:");
        horas = entrada.nextDouble();
        //proceso
        ganancias = horas*sueldohora;
        System.out.println("las ganancias totales del mes:"+ganancias);
        
        
        
        
        
        
    }
}
