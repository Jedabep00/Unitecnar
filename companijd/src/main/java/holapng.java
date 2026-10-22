
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class holapng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner entrada = new Scanner(System.in);
        //Declaracion de variable
       double diametro,radio,area,perimetro;
       //entrada
       System.out.print("digite el diametro:");
       diametro = entrada.nextDouble();
       //proceso
       radio = diametro/2;
       area = Math.PI*Math.pow(radio,2);
       perimetro = 2*Math.PI*radio;
       System.out.println("el area de un circulo es:"+area);
       System.out.println("el perimetro de un circulo es:"+perimetro);
    
    
    
    
    
    }
    
    
}
