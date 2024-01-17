package clasearray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio03 {

	/*
	 * Este programa pide al usuario 20 valores. Los 10 primeros valores se
	 * introducirán en un array, y los otros 10 en otro Array. Luego los
	 * compararemos y diremos al usuario si son iguales o no.
	 */
	public static void main(String[] args) {

		// Se crean dos arrays de enteros de tamaño 10
		int[] tabla = new int[10];
		int[] tabla2 = new int[10];

		// Se crea un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Este bucle for recorre el primer array, pidiendo al usuario que introduzca un
		// valor para cada posición
		for (int i = 0; i < tabla.length; i++) {
			try {
				System.out.println("Introduzca un valor: " + "(" + i + "/" + "20)");
				tabla[i] = sc.nextInt(); 
				// Se guarda el valor introducido por el usuario en la posición actual del
				// array
			} catch (InputMismatchException e) {
				// Si el usuario introduce un valor no válido (no numérico), se captura la
				// excepción y se muestra un mensaje de error
				sc.nextLine();
				System.err.println("Error. Has introducido un valor no válido.");
			}

		}

		// Este bucle for hace lo mismo que el anterior, pero para el segundo array
		for (int i = 0; i < tabla2.length; i++) {
			try {
				System.out.println("Introduzca un valor: " + "(" + (i + tabla.length) + "/" + "20)");
				tabla2[i] = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("Error. Has introducido un valor no válido.");
			}
		}

		// Se ordenan ambos arrays para poder compararlos correctamente
		Arrays.sort(tabla);
		Arrays.sort(tabla2);

		// Se comparan los dos arrays. Si son iguales, se muestra un mensaje
		// indicándolo. Si no, se muestra un mensaje diferente.
		if (Arrays.equals(tabla, tabla2)) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("No son iguales.");
		}

		// Finalmente, se cierra el Scanner para liberar recursos
		sc.close();

	}

}