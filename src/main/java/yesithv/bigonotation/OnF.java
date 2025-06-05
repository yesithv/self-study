package yesithv.bigonotation;

/**
 *  O(n!) – Tiempo factorial
 * crecen de forma explosiva, lo que los hace poco prácticos para entradas grandes.
 * Ejemplo: Generar todas las permutaciones posibles de una lista.
 */
public class OnF {

    public static void main(String[] args) {
        String resultado = "123";
        String str = "abcd";
        permutar(str, resultado);
        System.out.println("resultado = " + resultado);
        System.out.println("str = " + str);
    }

    public static void permutar(String str, String resultado) {
        if (str.length() == 0) {
            System.out.println(resultado);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permutar(str.substring(0, i) + str.substring(i + 1), resultado + str.charAt(i));
        }
    }

}
