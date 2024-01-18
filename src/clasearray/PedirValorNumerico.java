package clasearray;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PedirValorNumerico {
	/* Crearemos una función para pedir el Input del usuario, y
	 * la llamaremos en las clases siempre que haga falta. */
	
	public static int PideValor(int value) {
		Scanner sc = new Scanner(System.in);
		
		try {
			value = sc.nextInt(); 
			// Se guarda el valor introducido por el usuario en la posición actual del
			// array
		} catch (InputMismatchException e) {
			// Si el usuario introduce un valor no válido (no numérico), se captura la
			// excepción y se muestra un mensaje de error
			sc.nextLine();
			System.err.println("Error. Has introducido un valor no válido.");
		}
		
		// Cerramos el Scanner
		sc.close();
		
		// Devolvemos el valor.
		return value;
	}
}
