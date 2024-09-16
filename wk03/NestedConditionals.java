package wk03;

import java.util.Scanner;

public class NestedConditionals {
    public static void main(String[] args) {
// () parentheses
// [] brackets (or square brackets)
// {} braces or (curly braces)
//        {
//            int i = 5;
//            System.out.println(i);
//        }

        Scanner t = new Scanner(System.in);
//        System.out.println(i);
// conditional or conditional block
// > - operator (specifically - greater than)
// 6 > 7 - operation
        boolean f = false;
        System.out.print("Enter a number: ");
        if (t.hasNextInt() == false) {
            System.out.println("Bad data");
            return;
        }

        int input = t.nextInt();
        if (input > 5) {
            System.out.println(input + " is a big number");
            if (input >= 11) {
                System.out.println(input + " is a very big number");
            }

            if (input % 2 == 1 ||  input % 2 == -1 )  {
                System.out.println(input + " is odd");
            } else {
                System.out.println(input + " is even");
            }
// code below will never run because no number
// is bigger than 5 and negative
//            if(input < 0) {
//                System.out.println(input + " is negative");
//            }
        } else if (input < 0) {
            System.out.println(input + " is really negative");
        } else {
            System.out.println(input + " is a small");
        }
        System.out.println("done");
    }
}
