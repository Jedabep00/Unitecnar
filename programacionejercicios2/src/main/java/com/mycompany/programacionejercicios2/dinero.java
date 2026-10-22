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
public class dinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double pesoColom,dolarUsa;
        
        System.out.print("escriba el valor en peso colombiano:");
        pesoColom = entrada.nextDouble();
        
        dolarUsa = pesoColom * 0.00025;
        
        System.out.println("esto es en dolares:"+dolarUsa);
    }
    
}
