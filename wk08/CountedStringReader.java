package wk08;
import java.util.*;
import java.io.*;
public class CountedStringReader {
    public static void main(String[] args) throws IOException{
        String filename = "wk08/counted-strings.txt";
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);

        int size = fs.nextInt();
        for(int i = 0; i < size && fs.hasNext(); i++) {

            System.out.println(fs.next());

        }
        fr.close();
    }
}
