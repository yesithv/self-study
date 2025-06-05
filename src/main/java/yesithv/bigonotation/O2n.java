package yesithv.bigonotation;

/**
 * O(2ⁿ) – Tiempo exponencial
 * Ejemplo: Resolver el problema de la mochila (Knapsack) con fuerza bruta.
 * crecen de forma explosiva, lo que los hace poco prácticos para entradas grandes.
 */
public class O2n {

    public static void main(String[] args) {
        System.out.println("fibonacci(6) = " + fibonacci(6));
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2); // Muchas llamadas recursivas
    }

}
