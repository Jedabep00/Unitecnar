/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class aa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] decimales = {1,2,3,4,5,6,7,8,9,};

		for (int decimal : decimales) {
			System.out.println("Convirtiendo decimal a binario el número " + decimal);
			System.out.println("Manual: " + convertirDecimalABinarioManual(decimal));
			System.out.println("Usando funciones: " + convertirDecimalABinario(decimal));
		}
	}

	public static String convertirDecimalABinario(long decimal) {
		return Long.toBinaryString(decimal);
	}

	public static String convertirDecimalABinarioManual(long decimal) {
		if (decimal <= 0) {
			return "0";
		}
		StringBuilder binario = new StringBuilder();
		while (decimal > 0) {
			short residuo = (short) (decimal % 2);
			decimal = decimal / 2;
			// Insertar el dígito al inicio de la cadena
			binario.insert(0, String.valueOf(residuo));
		}
		return binario.toString();
    }
    
}
