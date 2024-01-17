package clasearray;

import java.util.Arrays;

public class Ejercicio04 {
	/* Haremos un programa que cree un array de tamaño 3
	 * y lo rellene con valores aleatorios entre 0 y
	 * 9. Luego lo ordenaremos e imprimiremos en
	 * pantalla.*/
	public static void main(String[] args) {

		// Crea un nuevo array de enteros de tamaño 30
		int[] tabla = new int[30];

		// Este bucle for recorre el array, asignando a cada posición un número
		// aleatorio entre 0 y 9
		for (int i = 0; i < tabla.length; i++) {
			// Math.random() genera un número aleatorio entre 0.0 y 1.0, que se
			// multiplica por 10 y se convierte a entero
			tabla[i] = (int) (Math.random() * 10);

		}

		// Ordena el array en orden ascendente
		Arrays.sort(tabla);

		// Imprime el array ordenado en la consola
		System.out.println(Arrays.toString(tabla));

	}

}
