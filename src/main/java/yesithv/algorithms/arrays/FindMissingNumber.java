package yesithv.algorithms.arrays;

/**
 * Given an array arr[] of size n-1 with integers in the range of [1,n], the taks is to find the missing numbers from
 * the first n integers
 * Note: There are not duplicates in the list
 */
public class FindMissingNumber {

    /**
     * Examples:
     * Input: arr[] = [1, 2, 4, 6, 3, 7, 8] , n = 8
     * Output: 5
     * Explanation: Here the size of the array is 8, so the range will be [1, 8]. The missing number between 1 to 8 is 5
     * <p>
     * Input: arr[] = [1, 2, 3, 5], n = 5
     * Output: 4
     * Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
     */
    public static void main(String[] args) {
        //int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int[] arr = {1, 2, 3, 5};

        int arrLength = arr.length;
        System.out.println("arrLength = " + arrLength);


        for (int i = 1; i < arrLength; i++) {
            System.out.println("i+1 = " + (i + 1) + " arr[i] = " + arr[i]);
            if ((i + 1) != arr[i]) {
                System.out.println("The missing is = " + (i + 1));
                break;
            }


        }
    }
}
