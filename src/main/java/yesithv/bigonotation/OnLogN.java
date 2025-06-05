package yesithv.bigonotation;

import java.util.Arrays;

/**
 * O(n log n) – Tiempo lineal-logarítmico: crecen de forma moderada.
 */
public class OnLogN {

    //  * Ejemplo: Algoritmos de ordenamiento eficientes como Merge Sort o Quick Sort.
    public static void main(String[] args) {

        int[] numeros = {5, 2, 8, 1};
        Arrays.sort(numeros); // Usa un algoritmo eficiente como TimSort (O(n log n))
        System.out.println(Arrays.toString(numeros));

    }
}
