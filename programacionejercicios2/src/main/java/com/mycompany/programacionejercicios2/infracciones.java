/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.programacionejercicios2;

import java.util.Scanner;

/**
 *
 * @author Biblioteca
 */
public class infracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double infratotal,inframatutina,infranocturna,infravespertino,promatutino,provespertino,pronocturno;
        
        
        System.out.print("escriba el total de las multas:");
        infratotal = entrada.nextDouble();
        
        inframatutina = infratotal * 0.20;
        infravespertino = infratotal * 0.35;
        infranocturna = infratotal * 0.45;
        
        promatutino = inframatutina / 30;
        provespertino = infravespertino / 30;
        pronocturno = infranocturna / 30;
        
        System.out.println("promedio por la mañana:"+promatutino);
        System.out.println("promedio por la tarde:"+provespertino);
        System.out.println("promedio por la noche:"+pronocturno);
    
        
    }
    
}
