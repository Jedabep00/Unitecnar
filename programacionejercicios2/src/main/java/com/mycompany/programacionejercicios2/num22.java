/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionejercicios2;

import java.util.Scanner;

/**
 *
 * @author Biblioteca
 */
public class num22 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
         double longitud,area,volumen;
         
         System.out.print("Escriba la longitud del cubo:");
         longitud = entrada.nextDouble();
         
         area = 6*Math.pow(longitud,2);
         volumen =Math.pow(longitud,3);
         
         System.out.println("el area de un cubo es:"+area);
         System.out.println("el volumen de un cubo es:"+volumen);
         
    }
    
}
