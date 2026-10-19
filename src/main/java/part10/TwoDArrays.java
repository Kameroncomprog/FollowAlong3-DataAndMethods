package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6651s
//        starts at 1:50:51 — stop at about 1:57:41, at "so that is the basics of 2D arrays"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 10 — 2D arrays (an array of arrays: rows and columns)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrays.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class TwoDArrays {
    // start of the the program
    public static void main(String[] args) {
        String[][] cars = new String[3][3];  // Creates a 2D array with 3 rows and 3 columns
        cars[0][0] = "Camaro"; // Stores Camaro in row 0, column 0
        cars[0][1] = "Corvette"; // Stores Corvette in row 0, column 1
        cars[0][2] = "Silverado"; // Stores Silverado in row 0, column 2
        cars[1][0] = "Mustang";  // Stores Mustang in row 1, column 0
        cars[1][1] = "Ranger"; // Stores Ranger in row 1, column 1
        cars[1][2] = "F-150"; // Stores F-150 in row 1, column 2
        cars[2][0] = "Ferrari"; // Stores Ferrari in row 2, column 0
        cars[2][1] = "Lambo"; // Stores Lambo in row 2, column 1
        cars[2][2] = "Tesla"; // Stores Tesla in row 2, column 2
        for (int i = 0; i < cars.length; i++) {  // Outer loop goes through each row
            System.out.println(); // Moves to a new line before printing each row
            for (int j = 0; j < cars[i].length; j++) { // Inner loop goes through each column in the current row

                System.out.print(cars[i][j] + " "); // Prints each car with a space after it
            }
        }






    }
}
