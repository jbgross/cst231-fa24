package wk11;


import java.io.*;
import java.util.*;

public class WedExamReview {
    public static void main(String[] args) throws IOException  {
        copyFile("wk11/in.txt");
        addBinary(101, 101);
        String data = "101 0";
        int x = Integer.parseInt(data);
        System.out.println(x);
    }

    public static void addBinary(long b1, long b2) {
        long carry = 0;
        long output = 0;
        int pow = 0;
        while(b1 > 0 || b2 > 0 || carry > 0) {
            long firstBit = b1%10;
            long secondBit = b2%10;
            long sum = firstBit + secondBit + carry;
//            System.out.println(sum);
            if(sum == 0) {
                // add a zero to the lefthand side of the output
                output += 0 * (long) Math.pow(10, pow);
                carry = 0;
            } else if(sum == 1) {
                // add a one to the lefthand side of the output
                output += 1 * (long) Math.pow(10, pow);
                // set carry to zero
                carry = 0;
            } else if(sum == 2) {
                // add a zero to the lefthand side of the output
                output += 0 * (long) Math.pow(10, pow);
                // set carry to one
                carry = 1;
            } else {
                // add a one to the lefthand side of the output
                output += 1 * (long) Math.pow(10, pow);
                // set carry to one
                carry = 1;
            }
            pow++;
            b1 /= 10;
            b2 /= 10;
        }
//        if(carry > 0) {
//            output += 1 * (long) Math.pow(10, pow);
//        }
        System.out.println(output);
    }

    public static void copyFile(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);
        FileWriter fw = new FileWriter("wk11/out.txt");
        PrintWriter pw = new PrintWriter(fw);
        while(fs.hasNext()) {
            String data = fs.next();
            pw.println(data);
        }
        fw.close();
        fr.close();
    }
}
