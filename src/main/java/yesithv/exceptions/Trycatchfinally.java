package yesithv.exceptions;

public class Trycatchfinally {
    public static void main(String[] args) {
        int n = 10;
        int m = 0;
        try {
            int ans = n / m;
            System.out.println("Answer = " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero !");
        } finally {
            System.out.println("Inside finally");
        }
        System.out.println("After handling exception");

    }
}
