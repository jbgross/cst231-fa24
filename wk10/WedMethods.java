package wk10;

import java.io.*;
import java.util.Scanner;

public class WedMethods {
    public static void main(String[] args) throws IOException {
        foo(4);
        foo(4.0);
        foo("4");
        foo();
        System.out.println(isOdd(-3));
        System.out.println(isOdd(3));
        System.out.println(addFour(6));
        Scanner in = new Scanner(System.in);
        String input = getWord(in, true);
//        String input = getWord();
        System.out.println("You entered: " + input);
        FileReader fr = new FileReader("wk08/data1.txt");
        Scanner fs = new Scanner(fr);
        String fileWord = getWord(fs, false);
        System.out.println("I read: " + fileWord);

        fr.close();

//        System.out.println(printIsEven(4));
//        System.out.println(number);
    }


    public static void foo(int i) {
        System.out.println("int foo");
    }

    public static void foo(double u) {
        System.out.println("double foo");
    }

    public static void foo(String s) {
        System.out.println("String foo");
    }

    public static void foo() {
        System.out.println("no parameter foo");
    }

    public static String getWord(Scanner s, boolean printPrompt) {
        if(printPrompt) {
            System.out.print("Enter word: ");
        }
        return s.nextLine();
    }

    public static int addFour(int number) {
        return number + 4;
    }

    public static void printIsEven(int number) {
        if(isEven(number)) {
            System.out.println(number + " is even");
        }
    }

    public static boolean isEven(int number) {
//        return number % 2 == 0;
        return ! isOdd(number);
    }

    public static boolean isOdd(int number) {
//        if(number % 2!= 0) {
//            return true;
//        } else {
//            return false;
//        }
//        if(number % 2!= 0) {
//            return true;
//        }
//        return false;
        return number % 2 != 0;
    }
}
