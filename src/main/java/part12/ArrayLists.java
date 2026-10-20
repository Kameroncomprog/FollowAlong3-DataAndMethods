package part12;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        starts at about 2:12:02 — stop at about 2:16:20, when he says "that is ArrayLists in Java"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 12 — ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayLists.
//    Leave the "package part12;" line and the "public class ArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

import java.util.ArrayList;

public class ArrayLists {
    // start of program
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();  // Creates an empty ArrayList called food
        food.add("pizza"); // Adds pizza to the ArrayList
        food.add("hamburger"); // Adds hamburger to the ArrayList
        food.add("hotdog"); // Adds hotdog to the ArrayList
        for (int i = 0; i < food.size(); i++) { // Loops through every item in the ArrayList
            System.out.println(food.get(i)); // Prints each food using its index
        } // Ends the for loop
        food.set(0, "sushi"); // Replaces pizza at index 0 with sushi
        System.out.println(food); // Prints [sushi, hamburger, hotdog]
        food.remove(2); // Removes hotdog at index 2
        System.out.println(food); // Prints [sushi, hamburger]
        food.clear(); // Removes all items from the ArrayList
        System.out.println(food); // Prints [] because the ArrayList is empty





    }
}
