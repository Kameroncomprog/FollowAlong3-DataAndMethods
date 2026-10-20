package part12;

import java.util.ArrayList;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8637s
//        rewatch 2:23:57–2:27:20 for the for-each loop
// Guide: GUIDE.md in this folder, steps 11–13
//
// SECTION D — Challenge. Two methods. The README explains each one.
// A test in src/test/java/part12/ChallengeTest.java checks your answers.
// Change ONLY the lines marked YOUR CODE. Do not change the test file.

public class Challenge {

    // countEvens([2, 1, 2, 3, 4]) should return 3
    // countEvens([1, 3, 5])       should return 0
    public static int countEvens(ArrayList<Integer> nums) {
        int count = 0; // Starts the count at 0

        for (int n : nums) { // Loops through each number in the ArrayList
            if (n % 2 == 0) { // Checks if the number is even
                count++; // Adds 1 to the count
            } // Ends the if statement
        } // Ends the for loop

        return count; // Returns the total number of even numbers
    }

    // spread([3, 9, 2, 5]) should return 7   (biggest 9 minus smallest 2)
    // spread([42])         should return 0
    public static int spread(ArrayList<Integer> nums) {
        int max = nums.get(0); // Starts max at the first number
        int min = nums.get(0); // Starts min at the first number

        for (int n : nums) { // Loops through each number in the ArrayList
            if (n > max) { // Checks if the number is bigger than max
                max = n; // Updates the biggest number
            } // Ends the if statement

            if (n < min) { // Checks if the number is smaller than min
                min = n; // Updates the smallest number
            } // Ends the if statement
        } // Ends the for loop

        return max - min; // Subtracts the smallest number from the biggest














    }
}
