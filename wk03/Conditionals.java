package wk03;
import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        System.out.print(number + " ");
        // operator
        // operation
        // operand
        if((number % 2) != 0) {
            System.out.println("is odd");
            System.out.println("and is not even");
        } else {
            System.out.println("is even");
            System.out.println("and is not odd");
        }

        String password = "s3cr3t";
        System.out.print("Enter password: ");
        String attempt = in.next();
        System.out.println(attempt);
//        if(attempt == password) {
        if(attempt.equals(password)) {
//        if("s3cr3t".equals(attempt)) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
    }
}
