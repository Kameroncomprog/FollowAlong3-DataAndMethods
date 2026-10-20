package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8210s
//        starts at about 2:16:50 — stop at about 2:23:45, when he says "that's how two-dimensional ArrayLists work"
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 12 — 2D ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrayLists.
//    Leave the "package part12;" line and the "public class TwoDArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class TwoDArrayLists {
    // start of program
    public static void main(String[] args) {
        ArrayList<String> bakeryList = new ArrayList<String>(); // // Creates an empty ArrayList for bakery foods
        bakeryList.add("pasta"); // Adds pasta to the bakery list
        bakeryList.add("garlic bread"); // Adds garlic bread to the bakery list
        bakeryList.add("donuts");  // Adds donuts to the bakery list
        ArrayList<String> produceList = new ArrayList<String>(); // Creates an empty ArrayList for vegetables
        produceList.add("tomatoes"); // Adds tomatoes to the produce list
        produceList.add("zucchini"); // Adds zucchini to the produce list
        produceList.add("peppers"); // Adds peppers to the produce list

        ArrayList<String> drinksList = new ArrayList<String>(); // Creates an empty ArrayList for drinks
        drinksList.add("soda"); // Adds soda to the drinks list
        drinksList.add("coffee"); // Adds coffee to the drinks list
        System.out.println(bakeryList); // Prints all items in the bakery list
        System.out.println(bakeryList.get(0)); // Prints pasta because it is at index 0
        System.out.println(drinksList); // Prints all items in the drinks list
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>(); // Creates a 2D ArrayList to hold multiple lists
        groceryList.add(bakeryList); // Adds the bakery list to groceryList
        groceryList.add(produceList); // Adds the produce list to groceryList
        groceryList.add(drinksList); // Adds the drinks list to groceryList
        System.out.println(groceryList); // Prints all three lists together
        System.out.println(groceryList.get(0)); // Prints the entire bakery list
        System.out.println(groceryList.get(0).get(0)); // Prints pasta from the bakery list
        System.out.println(groceryList.get(2).get(1)); // Prints coffee from the drinks list
    }
}
