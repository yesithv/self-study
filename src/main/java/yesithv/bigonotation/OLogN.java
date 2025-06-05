package yesithv.bigonotation;

/**
 * O(log n) – Tiempo logarítmico
 * crece muy lentamente.
 */
public class OLogN {
    /**
     * * Ejemplo: Búsqueda binaria en una lista ordenada.
     * * Caso real: Buscar un número de teléfono en una guía telefónica ordenada. Cada vez divides el espacio de búsqueda a la mitad.
     */
    public static void main(String[] args) {
// Búsqueda binaria en una lista ordenada
        int[] numeros = {1, 3, 5, 7, 9};
        int objetivo = 5;
        int izquierda = 0, derecha = numeros.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            if (numeros[medio] == objetivo) {
                System.out.println("Encontrado en la posición " + medio);
                break;
            } else
                if (numeros[medio] < objetivo) {
                izquierda = medio + 1;
                } else {
                    derecha = medio - 1;
                }
        }

    }
}
