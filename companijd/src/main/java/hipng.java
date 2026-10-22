
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class hipng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //declaracion de variables
        double aptos,votaron,dejaron,pordejaron;
        //entrada
        System.out.print("Digite el numero de habitantes aptos:");
        aptos = entrada.nextDouble();
        System.out.print("Digite el numero de habitantes que votaron:");
        votaron = entrada.nextDouble();
        //proceso
        dejaron = (votaron/aptos)*100;
        pordejaron = 100-dejaron;
        System.out.println("Habitantes que dejaron de votar:"+pordejaron);
    }
    
}
