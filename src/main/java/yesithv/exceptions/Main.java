package yesithv.exceptions;

/**
 * EXCEPTIONS:
 * Is unwanted or unexpected event that occurs and disrupts the normal flow
 * When an exception occurs, and it's not handled, the program terminates and the code after it, will never execute
 */
public class Main {
    public static void main(String[] args) {
        // Unchecked: Its not mandatory manage:
        int m = 0;
        int ans = 10/m;
        System.out.println("Answer: " + ans);
    }
}
