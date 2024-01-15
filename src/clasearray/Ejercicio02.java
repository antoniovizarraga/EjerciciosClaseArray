package clasearray;
import java.util.Arrays;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		// Declaramos un array de enteros de tamaño 55
		int[] tabla = new int[55];
		
		// Declaramos una variable index para llevar la cuenta de la posición en el array
		int index = 0;
		
		// Bucle for que se ejecuta 10 veces
		for (int i = 1; i <= 10; i++) {
			// Llena una parte del array con el valor de i
			// La parte va desde index hasta index + i
            Arrays.fill(tabla, index, index + i, i);
            // Actualiza index sumándole i
            index += i;
        }
		
		// Imprime el array
		System.out.println(Arrays.toString(tabla));
	}
}
