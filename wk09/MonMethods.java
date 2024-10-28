package wk09;
import java.util.*;
public class MonMethods {
    public static void main(String[] args) {
        Random r = new Random();
        int max = r.nextInt(10);
        System.out.println(max);
        for(int i = 0; i < 2; i++) {
            printHello();
        }
        printWord("ciao");
        String word = "hola";
        printWordNTimes(word, 2);
        System.out.println(word);
        int x = giveMeFive();
        System.out.println(x + 1);
        int y = doubleMe(5);
        System.out.println(y);
        System.out.println(pow(y, 3));
//        System.out.println(printHello());
    }

    public static int pow(int base, int exponent) {
        int result = 1;
        for(int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public static double sqrt(int base) {
        return 0;
    }

    public static int doubleMe(int y) {
        return y * 2;
    }

    public static int giveMeFive() {
        return 17;
    }

    public static void printWordNTimes(String word, int n) {
        for(int i = 1; i < n; i++) {
            word += word;
        }
        System.out.println(word);
//        return 1;
    }

    public static void printWord(String word) {
        System.out.println(word);
    }

    public static void printHello() {
        System.out.println("hello");
    }
}
