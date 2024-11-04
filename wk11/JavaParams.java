package wk11;

public class JavaParams {
    public static void main(String[] args) {
        int y = 5;
        System.out.println("y = " + y);
        setToZero(y);
        System.out.println("y = " + y);

        int [] a = {5, 4, 3, 2, 1};
        print(a);
        setToZero(a);
        print(a);
    }

    public static void setCopyToZero(int [] a) {
        int [] b = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    public static void setToZero(int x) {
        x = 0;
    }

    public static void setToZero(int [] a) {
        for(int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }

    public static void print(int [] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
