/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programacionejercicios2;

import java.util.Scanner;

/**
 *
 * @author Biblioteca
 */
public class Programacionejercicios2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       double centigrados,Fahrenheit;
       
       System.out.print("escriba la temperatura en centigrados:");
       centigrados = entrada.nextDouble();
       
       Fahrenheit = (9/5)*centigrados+32;
      
       System.out.println("la temperatura en grados fahrenheit es:"+Fahrenheit);
    }
}
