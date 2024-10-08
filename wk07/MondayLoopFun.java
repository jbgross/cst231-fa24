package wk07;
import java.util.Scanner;

public class MondayLoopFun {
    public static void main(String[] args) {
        String input = "yes";
        String continueInput = "yes";
        Scanner in = new Scanner(System.in);
//        int count = 0;
//        int count2 = ++count;
        while(input.equalsIgnoreCase(continueInput) /* && ++count > 0 */ ) {
            System.out.print("Continue? ");
            input = in.next();
        }
        System.out.println("done");

        do {
            System.out.print("Continue? ");
            input = in.next();
        } while(input.equalsIgnoreCase(continueInput));

        System.out.println("done 2");
        int max = 5;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < max;  i++ /*, count++ */ ) {
            System.out.print("Enter a number: ");
            int inputNumber = in.nextInt();
            if(inputNumber == 0) {
                break;
            } else {
                count++;
            }
            sum += inputNumber;
//            input = in.next();
        }
        System.out.println((0.0+sum)/count);
        System.out.println((double)sum/count);
//        System.out.println((0.0+sum)/max);
//        System.out.println((double)sum/max);
        System.out.println("done 3");
    }
}
