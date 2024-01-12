package clasearray;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Inicializa la variable firstValue
		int firstValue = 0;
		
		// Inicializa la variable secondValue
		int secondValue = 0;

		// Declara un array de enteros
		int[] tabla; 
		
		// Crea un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in); 
		
		try {
			// Solicita al usuario que introduzca un valor
			System.out.println("Introduzca un valor: "); 
			
			// Asigna el valor introducido a firstValue
			firstValue = sc.nextInt(); 

			// Solicita al usuario que introduzca un segundo valor
			System.out.println("Introduzca el segundo valor: "); 
			
			// Asigna el valor introducido a secondValue
			secondValue = sc.nextInt(); 
		} catch (InputMismatchException e) {
			
			// Limpia el buffer del Scanner
			sc.nextLine(); 
			
			// Imprime un mensaje de error si el valor introducido no es un entero
			System.err.println("Error. Has introducido un valor que no es entero."); 
		}

		// Inicializa el array con la longitud especificada por firstValue
		tabla = new int[firstValue]; 
		
		// Rellena el array con el valor especificado por secondValue
		Arrays.fill(tabla, secondValue); 

		// Imprime el array
		System.out.println(Arrays.toString(tabla)); 

		// Cierra el Scanner
		sc.close(); 
	}

}