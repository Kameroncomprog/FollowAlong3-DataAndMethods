package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        starts at about 2:27:54 — stop at about 2:39:30, when he says "those are methods"
// Guide: GUIDE.md in this folder, steps 1–11
//
// Part 13 — methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Methods.
//    Leave the "package part13;" line and the "public class Methods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Methods {
    // start of the program
    public static void main(String[] args) {
        // we assign "Bro" to String variable called name
        String name = "Bro";
        // we assign #21 to int variable called age
        int age = 21;
        // we are calling the method hello that has parameters of name, age
        hello(name, age);
        // we assign the number 3 to int variable named x
        int x = 3;
        // we assign number 4 to int variable named y
        int y = 4;
        // we assign the value of add(x,y) which is 7 to int variable called z
        int z = add(x, y);
        // system outputs 7
        System.out.println(z);
        //system outputs 7
        System.out.println(add(x, y));

    }// we end this method but the variable are local so they can still be ascessible b/c they are inside of the main



    // start of new method called hello that have parameters of string variable called name and int variable called age
    static void hello(String name, int age) {
        //system outputs hello
        System.out.println("hello");
        // system outputs Hello + str concadenation and calls name from the main method which prints Bro
        System.out.println("Hello " + name);
        //system outputs You are + str concadenation and then calls age from main method from start of the program and prints 21
        System.out.println("You are " + age);
    } // we end this method right here

    // start of new method called add thas has parameters of int variable called x and int variable called y
    static int add(int x, int y) {
        // we assign both int variables x & y and add them together and assign them int variable z
        int z = x + y;
        // we return x + y which is 7 just another way to get 7 instead of adding the variable of z in add in when we call it in main method
        return x+y;



    }
}
