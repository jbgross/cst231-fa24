package wk12;

public class Exam {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("1: "+x);
        x = c(x);
        System.out.println("3: " + x);

        int y = 1;
        System.out.println("A: " + y);
        y = d(y);
        System.out.println("C: " + y);
    }

    public static int c(int foo) {
        System.out.println("2: " + ++foo);
        return foo;
    }
    public static int d(int foo) {
        System.out.println("B: " + (foo + 1));
        return foo;
    }
}
