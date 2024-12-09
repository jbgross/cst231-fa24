package wk14;
import com.google.common.base.Stopwatch;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SearchPerformance {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter the filename: ");
        // String filename = in.next();
        String filename = "wk14/twenty_numbers.txt";
        int [] data = readNumbers(filename);
        timeTest(in, data);
    }

    public static int[] readNumbers(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);
        int size = fs.nextInt();
        int[] data = new int[size];
        for (int i = 0; i < data.length && fs.hasNextInt(); i++) {
            data[i] = fs.nextInt();
        }
        fr.close();
        return data;
    }

    public static boolean linearSearch(int[] data, int value) {
        for(int i = 0; i < data.length; i++) {
            if(data[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] data, int value) {
        int start = 0;
        int end = data.length - 1;
        while(start <= end) {
            int middle = (start + end)/2;
            int midVal = data[middle];
            if(midVal == value) {
                return true;
            } else if(midVal > value) {
                // in first half
                end = middle - 1;
            } else {
                // in second half
                start = middle + 1;
            }
        }
        return false;
    }

    public static void timeTest(Scanner in, int[] data) {

        int input = -1;
        while (input != 0) {
            System.out.print("Enter a number to search (0 to quit): ");
            input = in.nextInt();
            System.out.println("Starting the linear search...");
            Stopwatch linearTime = Stopwatch.createStarted();
            linearSearch(data, input);
            linearTime.stop();

            Stopwatch binaryTime = Stopwatch.createStarted();
            binarySearch(data, input);
            binaryTime.stop();

            System.out.printf("Linear Time: %,d microseconds, Binary Time: %,d microseconds",
                    linearTime.elapsed(TimeUnit.MICROSECONDS),
                    binaryTime.elapsed(TimeUnit.MICROSECONDS));
            //        System.out.printf("\t%,d\t%,d", lCount, bCount);
            System.out.println();
        }
    }
}
