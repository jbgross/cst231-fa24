package wk08;
import java.io.*;
import java.util.*;
public class StringReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("wk08/strings1.txt");
        Scanner fs = new Scanner(fr);
        int count = 0;
        while(fs.hasNext()) {
            String input = fs.next();
            System.out.println(input);
            count++;
        }
        System.out.println("Read in " + count + " words");

        fr.close();
    }
}
