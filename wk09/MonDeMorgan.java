package wk09;

import java.util.Scanner;

public class MonDeMorgan {
    public static void main(String[] args) {
        String yes = "yes";
        String no = "no";
        Scanner in = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter yes or no to quit: ");
            input = in.next();
        } while(! (input.equals(yes) || input.equals(no))); // correct
//        } while(! (input.equals(yes) && input.equals(no))); // wrong
//        } while(! input.equals(yes) && !  input.equals(no)); // correct
//        } while(! input.equals(yes) || ! input.equals(no)); // wrong

        System.out.println("You entered: " + input);
    }
}
