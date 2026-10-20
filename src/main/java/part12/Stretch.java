package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        rewatch 2:12:00–2:16:20 for ArrayList, 2:16:50–2:23:45 for 2D ArrayList,
//        2:23:57–2:27:20 for the for-each loop
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet, and no import. Typing both is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.set(1, "yellow");
        colors.remove(0);
        // system outputs [yellow, blue]
        System.out.println(colors); // system outputs 2
        System.out.println(colors.size());
        System.out.println(colors.get(0)); // system outputs yellow
        for (String c : colors) {
            System.out.print(c + " "); // system outputs yellow blue
        }
        System.out.println();

        //B1.
        ArrayList<Integer> scores = new ArrayList<Integer>(); // Creates an empty ArrayList for scores

        scores.add(90); // Adds 90 to the list
        scores.add(75); // Adds 75 to the list
        scores.add(88); // Adds 88 to the list

        int sum = 0; // Starts the total at 0

        for (int s : scores) { // Loops through each score in the ArrayList
            sum = sum + s; // Adds each score to the total
        } // Ends the for loop

        System.out.println("Total: " + sum); // Prints the total of 253

        //B2.
        ArrayList<String> playlist = new ArrayList<String>(); // Creates an empty ArrayList for songs

        playlist.add("Song A"); // Adds Song A
        playlist.add("Song B"); // Adds Song B
        playlist.add("Song C"); // Adds Song C
        playlist.add("Song D"); // Adds Song D

        for (int i = 0; i < playlist.size(); i++) { // Loops through each song
            System.out.println((i + 1) + ". " + playlist.get(i)); // Prints the song number and name
        } // Ends the for loop

        playlist.remove(1); // Removes Song B at index 1

        System.out.println("Songs left: " + playlist.size()); // Prints how many songs are left

        System.out.println(playlist); // Prints the remaining songs

        //B3.
        ArrayList<String> row1 = new ArrayList<String>(); // Creates the first row
        row1.add("Ana"); // Adds Ana to row 1
        row1.add("Ben"); // Adds Ben to row 1

        ArrayList<String> row2 = new ArrayList<String>(); // Creates the second row
        row2.add("Cam"); // Adds Cam to row 2
        row2.add("Dee"); // Adds Dee to row 2
        row2.add("Eli"); // Adds Eli to row 2

        ArrayList<ArrayList<String>> seats = new ArrayList<>(); // Creates a 2D ArrayList

        seats.add(row1); // Adds the first row
        seats.add(row2); // Adds the second row

        for (ArrayList<String> row : seats) { // Loops through each row
            System.out.print("Row:"); // Prints Row: without starting a new line

            for (String person : row) { // Loops through each person in the row
                System.out.print(" " + person); // Prints each person's name
            } // Ends the inner loop

            System.out.println(); // Moves to the next line
        } // Ends the outer loop

        System.out.println("Back corner: " + seats.get(1).get(2)); // Prints Eli









    }
}
