package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        rewatch 2:28:40–2:35:20 for parameters, 2:35:25–2:39:30 for return types
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it — and your own methods
// underneath it — is part of the stretch.

public class Stretch {
    // start of program allows u to use everything at the start
    public static void main(String[] args) {
        // we assign 5 to the int variable called x
        int x = 5;
        //  is the command telling the computer to drop an item named x into that box so the box can do something to it.
        change(x);
        // system outputs x
        System.out.println(x);
        // system outputs x twice
        System.out.println(twice(x));
        // system outputs Hi sam 3 times
        System.out.println(twice(twice(x)));
        greet("Sam", 3);
        System.out.println(square(4));
        System.out.println(square(9));
        System.out.println(average(90, 80, 85));
        System.out.println(average(1, 2, 2));
        System.out.println(rating(5));
        System.out.println(rating(4));
        System.out.println(rating(1));
        System.out.println(rating(9));
    }

    static void change(int x) {
        x = 100;
    }

    static int twice(int n) {
        return n * 2;
    }

    static void greet(String who, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("Hi " + who + "! ");
        }
        System.out.println();
    }

    //B1.
    static int square(int n) {
        return n * n;
    }
    //B2.
    static double average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    //B3.
    static String rating(int stars) {
        if (stars == 5) {
            return "Amazing";
        } else if (stars == 3 || stars == 4) {
            return "Good";
        } else if (stars == 1 || stars == 2) {
            return "Bad";
        } else {
            return "Invalid";
        }
    }
}
