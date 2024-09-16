package wk04;

import java.util.Scanner;

public class LoopFun {
    public static void main(String[] args) {
        String password = "hElLo";
        Scanner in = new Scanner(System.in);
        String entry = "";
        System.out.print("Enter your password: ");
        entry = in.next();
        while(! password.equalsIgnoreCase(entry)) {
            System.out.print("Wrong! Enter your password: ");
            entry = in.next();
        }
        System.out.println("Correct!");

        System.out.println("before");
        // 1. Create loop variable
        int i = 0;
        // 2. Loop condition
        while (i < 10) {
            // 4. Update the loop variable
            i++;            
            // 3. Body of the loop - behavior we want to repeat
            System.out.println(i);

        }
        int k = 0;
        while(k++ < 10) {
            System.out.println(k);
        }
        System.out.println("i = " + i);
        System.out.println("k = " + k);
        System.out.println("after");

//        while(true) {
//            System.out.print("\thello");
//        }

    }
}
