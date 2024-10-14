package wk08;
import java.io.*;
import java.util.*;
public class MonReadingFiles {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("wk08/data1.txt");
        Scanner fi = new Scanner(fr);
        int count = 0;
        while(fi.hasNext()) {
            System.out.println(fi.next());
        }
        fr.close();

        FileReader fr2 = new FileReader("wk08/data2.txt");
        Scanner fi2 = new Scanner(fr2);
//        while(fi2.hasNextInt()) {
        int intSum = 0;
        double doubleSum = 0;
        while(fi2.hasNext()) {
            if(fi2.hasNextInt()) {
                int nextNumber = fi2.nextInt();
                System.out.println("next int is " + nextNumber);
                intSum += nextNumber;
            } else if (fi2.hasNextDouble()) {
                doubleSum += fi2.nextDouble();
            } else {
                System.out.println(fi2.next());
            }
//            System.out.println(fi2.nextInt());

        }
        System.out.println("intSum = " + intSum);
        System.out.println("doubleSum = " + doubleSum);
        System.out.println("done");

        fr2.close();
    }
}
