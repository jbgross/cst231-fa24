package wk02;

//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

public class /* block comment don't do this */ Wed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sides for die: ");
        int sides = input.nextInt();

        //        int sides = 5;
//        sides = input.nextInt();
//        System.out.println("sides = " + sides);

        Random rand = new Random();
        int roll = (Math.abs(rand.nextInt())%sides) + 1;
        System.out.println("Roll: " + roll);

    }
}
