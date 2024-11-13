package wk12;
import java.io.*;
import java.util.*;
public class WedArrays {

    public static void main(String[] args) throws IOException {
        int [] a = new int[30];
        print(a,0);
        String filename = "wk12/data.txt";
        int size = loadArray(filename, a);
        print(a, size);
        System.out.println("mean: " + average(a, size));
        System.out.println("evens: " + countEvens(a, size));
    }

    public static int countEvens(int [] a, int size) {
        int count = 0;
        for(int i = 0; i < size && i < a.length; i++) {
            int element = a[i];
            if(isEven(element)) {
//            if(isEven(a[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int x) {
        return x%2 == 0;
    }

    public static double average(int [] data, int size) {
        int sum = 0;
        for(int i = 0; i < size && i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("sum: " + sum);
        return 1.0*sum/size;
    }

    public static int loadArray(String filename, int [] a) throws IOException {
        System.out.println("Length of array: " + a.length);
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);
        int index = 0;
        while(fs.hasNextInt() && index < a.length) {
            a[index++] = fs.nextInt();
        }

        fr.close();

        return index;
    }

    public static void print(int [] a, int size) {
        if (size > a.length) {
            System.out.println("bad size");
            return;
        }
        for(int i = 0; i < a.length && i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
