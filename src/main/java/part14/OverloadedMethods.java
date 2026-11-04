package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        starts at about 2:40:18 — stop at about 2:45:29, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 14, video 1 — overloaded methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedMethods.
//    Leave the "package part14;" line and the "public class OverloadedMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class OverloadedMethods {
    // start of the program
    public static void main(String[] args) {
        // we call the method add and assign value of 1,2 which is a and b and add them together and assign that to x
        int x = add(1,2);
        // system outputs x
        System.out.println(x);
        // we call the method add and assign the value of 1+2+3 to z
        int z = add(1,2,3);
        // system outputs z
        System.out.println(z);
        // we call the method add and assign the value of 1+2+3+4 to y
        int y = add(1,2,3,4);
        //system outputs y
        System.out.println(y);
        //we call the method add and assign the value of 1.0+2.0+3.0+4.0 to double variable called d
        double d = add(1.0,2.0,3.0,4.0);
        // system ouputs d
        System.out.println(d);
    } // end of main
    // start of new method
    static int add(int a, int b){
        // system ouputs This is overload method #1
        System.out.println("This is overload method #1");
        //return the sum of a+b
        return a+b;

    }// end of method
    // start of new method called add that takes parameters of int variables a,b,c
    static int add(int a, int b, int c){
        // system outputs This is overload method #2
        System.out.println("This is overload method #2");
        // return sum of a+b+c
        return a+b+c;
    }// end of method
    // start of new method called add that takes parameters of int a,b,c,d
    static int add(int a, int b, int c, int d){
        // system outputs This is overload method #3
        System.out.println("this is overload method #3");
        //returns sum of a+b+c+d
        return a+b+c+d;
    }// end of method
    // start of new method called add that takes parametes of double a,b
    static double add(double a, double b){
        // system outputs This is overload method #4
        System.out.println("This is overload method #4 ");
        // returns a+b
        return a+b;
    } // method ends
    // new method begins that is called add that takes parameters of double a,b,c,
    static double add(double a, double b, double c){
        // systen outputs This is overload method #5
        System.out.println("This is overlaod method #5");
        // returns sum of a+b+c
        return a+b+c;
    } // end of method
    // start of new method called add that holds double parameters of a,b,c,d
    static double add(double a, double b, double c, double d ){
        // system out This is overload method #6
        System.out.println("This is overlaod method #6");
        // returns sum of a+b+c+d
        return a+b+c+d;
    }
}
