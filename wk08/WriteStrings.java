package wk08;
import java.io.*;
import java.util.*;
public class WriteStrings {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("wk08/strings1.txt");
        PrintWriter pw = new PrintWriter(fw);
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a word, or 0 to quit: ");
            String input = in.next();
            if (!input.equals("0")) {
                pw.println(input);
            } else {
                break;
            }
        }
        System.out.println(in.nextLine());

//        pw.println("goodbye");

        fw.close();
    }
}
