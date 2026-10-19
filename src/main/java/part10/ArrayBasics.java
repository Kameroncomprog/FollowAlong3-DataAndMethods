package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s
//        starts at 1:43:42 — stop at about 1:49:45, at "so that's what an array is"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 10 — arrays (many values in one variable)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayBasics.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ArrayBasics {
    // start of the program
    public static void main(String[] args) {

        String car = "Camaro"; // Creates a String variable called car and stores Camaro
        String[] cars = {"Camaro", "Corvette", "Tesla"};  // Creates an array that stores 3 car names
        cars[0] = "Mustang";  // Changes the first car from Camaro to Mustang
        System.out.println(cars[0]);  // Prints the first car (Mustang)
        System.out.println(cars[1]);   // Prints the second car (Corvette)
        System.out.println(cars[2]);   // Prints the third car (Tesla)
        for (int i = 0; i < cars.length; i++) { // Loops through every car in the array
            System.out.println(cars[i]);  // Prints each car using its index
        }




    }
}
