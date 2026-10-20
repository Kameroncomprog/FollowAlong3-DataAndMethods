package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        starts at about 1:58:15 — stop at about 2:03:35, when he says "those are a few of the more useful String methods"
// Guide: GUIDE.md in this folder, steps 1–10
//
// Part 11 — String methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StringMethods.
//    Leave the "package part11;" line and the "public class StringMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class StringMethods {
    public static void main(String[] args) {
        String name = "Bro";
        boolean equalsResult = name.equals("Bro"); // Checks if name equals "Bro" exactly
        System.out.println(equalsResult); // Prints true
        boolean lowerResult = name.equals("bro"); // Checks if name equals "bro" with lowercase b
        System.out.println(lowerResult);  // Prints false because Java is case-sensitive
        boolean ignoreResult = name.equalsIgnoreCase("bro"); // Compares the words without checking uppercase or lowercase
        System.out.println(ignoreResult); // Prints true
        int lengthResult = name.length(); // Counts how many characters are in "Bro"
        System.out.println(lengthResult); // Prints 3
        char charResult = name.charAt(0); // Gets the first character of "Bro"
        System.out.println(charResult); // Prints B
        int indexResult = name.indexOf("o"); // Finds the position of the letter o in "Bro"
        System.out.println(indexResult); // Prints 2 because counting starts at 0
        boolean emptyResult = name.isEmpty(); // Checks if the String is empty
        System.out.println(emptyResult); // Prints false because name contains letters
        String upperResult = name.toUpperCase(); // Changes all letters to uppercase
        System.out.println(upperResult); // Prints BRO
        String lowerCaseResult = name.toLowerCase(); // Changes all letters to lowercase
        System.out.println(lowerCaseResult); // Prints bro
        String spaced = "   Bro   "; // Creates a String with spaces before and after Bro
        String trimResult = spaced.trim(); // Removes the extra spaces before and after Bro
        System.out.println("[" + spaced + "]");  // Prints [   Bro   ] with spaces
        System.out.println("[" + trimResult + "]"); // Prints [Bro] without extra spaces
        String replaceResult = name.replace('o', 'a');  // Replaces the letter o with a
        System.out.println(replaceResult); // Prints Bra


    }
}
