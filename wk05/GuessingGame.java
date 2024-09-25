package wk05;
import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        int max = 20;
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        if(name.equals("Josh")) {
            System.out.println("Hello, Josh");
        } else {
            System.out.println("Hello, someone else");
        }

        int secret = Math.abs(rand.nextInt())%max + 1;
//        System.out.println(secret);
        int guess;
        do {
            System.out.print("Guess? ");
            guess = in.nextInt();
            if(guess < 1) {
                System.out.println("Guess must be positive");
                continue;
            }
            System.out.println("checking your answer");
        } while(guess != secret);
        System.out.println("you won");

    }
}
