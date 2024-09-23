package wk05;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 1;
        while(input != 0) {
//        while(true) {
            System.out.print("Enter a number: ");
            input = in.nextInt();
            if(input == 0) {
                continue;
            } else if(input % 2 == 0) {
                // number is even
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
//            System.out.print("Enter a number: ");
//            input = in.nextInt();
        }
        System.out.println("done");
    }
}
