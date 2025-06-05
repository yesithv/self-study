package yesithv.bigonotation;

/**
 *  O(n²) – Tiempo cuadrático: crece rápidamente.
 */
public class On2 {

    //  * Ejemplo: Algoritmo de ordenamiento burbuja (Bubble Sort).
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println(numeros[i] + ", " + numeros[j]); // Todos los pares posibles
            }
        }

    }
}
