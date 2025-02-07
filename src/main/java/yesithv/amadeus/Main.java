package yesithv.amadeus;


public class Main {

    // Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers,
    // Task1: return the list of integers that are present in each array of nums
    // Task: 2: sorted in ascending order.
    public static void main(String[] args) {
        int[][] nums = {{3, 1, 2, 4, 5},
                {1, 2, 3, 4},
                {3, 4, 5, 6}};
        // Output: [3,4]
        // Input: nums = [[1,2,3],[4,5,6]]
        //Output: []

        // i => rows
        // j => columns


        int j=0;
        for(int i=1; i<nums.length; i++) {
            int pivot= nums[0][j];
            int counter = 0;
            int item = 0;
            for (j=0; j<nums[i].length; j++) {
                item = nums[i][j];
                if (pivot==item){
                    counter++;
                    break;
                }
            }
            if (counter==3){
                System.out.printf("item: " + item);
            }

        }
    }




}
