package yesithv.algorithms.arrays;

public class SumNextNElements {
    public static void main(String[] args) {

        int[] array = {3, 5, 3, 6, 1, 8}; // Length = 6, repeat = 4
        // Expected: {(3)3, (5+3)8, (3+6+1)10, (6+1+8)15 }

        int arrayLength = array.length;
        int count = 0;
        for (int i = 0; i < arrayLength; i++) {
            int sum = 0;
            for (int j = i; j <= count; j++){
                sum = sum + array[j];
            }
            count++;
            System.out.println("sum = " + sum);
        }
    }
}
