package clasearray;

import java.util.Arrays;

public class Ejercicio06 {

	/*
	 * Crearemos un programa que cree un array de 1000 valores enteros aleatorios.
	 * Luego le pediremos al usuario un valor, y al introducirlo, le diremos cuántas
	 * veces aparece dicho valor en el Array.
	 */
	public static void main(String[] args) {

		// Creamos un array de 1000 elementos para almacenar los números aleatorios
		int[] tabla = new int[1000];

		// Esta variable almacenará el valor introducido por el usuario
		int userValue = 0;

		// Esta variable llevará la cuenta de cuántas veces se encuentra el número
		// introducido por el usuario en el array
		int timesNumberHasBeenFound = 0;

		// Este bucle llena el array con números aleatorios entre 0 y 99
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}

		// Ordenamos el array para facilitar la búsqueda del número introducido por el
		// usuario
		Arrays.sort(tabla);

		// Pedimos al usuario que introduzca un número
		System.out.println("Introduzca un valor: ");
		userValue = PedirValorNumerico.PideValor(userValue);

		// Este bucle recorre el array y aumenta el contador cada vez que encuentra el
		// número introducido por el usuario
		for (int i = 0; i < tabla.length; i++)
			if (userValue == tabla[i])
				timesNumberHasBeenFound++;

		// Imprimimos el número de veces que se ha encontrado el número introducido por
		// el usuario en el array
		System.out.println("El valor " + userValue + " ha sido encontrado " +
		timesNumberHasBeenFound + " veces.");

	}

}
