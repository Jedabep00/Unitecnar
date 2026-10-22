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
class Escanner {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double pobInicial,pobBolivar,emigracion,inmigracion,increNacimientos,reducporViolencia,pobtotalcart,pobtotalboli;
        
        
         System.out.print("Ingrese la población inicial de Cartagena: ");
        pobInicial = entrada.nextDouble();

        System.out.print("Ingrese la población del resto de Bolívar: ");
        pobBolivar = entrada.nextDouble();

        emigracion = pobInicial * 0.02  ;
        inmigracion = pobBolivar *  0.005 ;
        increNacimientos = pobInicial * 0.05 ;
        reducporViolencia =pobInicial *  0.08 ;
        pobtotalcart = emigracion * increNacimientos;
        pobtotalboli = inmigracion * reducporViolencia ;
        
        System.out.println("habitantes en cartagena:"+pobtotalcart);
        System.out.println("habitantes en bolivar:"+pobtotalboli);
       
        
        
    }
    
}
