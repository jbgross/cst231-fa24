package wk11;

public class MonArrays {
    public static void main(String[] args) {
        int x = 5;
        x = 6;
        int [] y = new int[5];
        System.out.println("y = " + y);
        System.out.println("first element of y: " + y[0]);
        y[0] = 4;
        System.out.println("first element of y: " + y[0]);
//        y = 4;

        int [] z = {1,2,3,4,5};
//        z = new int[1];
        System.out.println("first element of z: " + z[0]);
        print(z);
//        for(int i = 0; i < z.length; i++) {
//            System.out.print(z[i] + " ");
//        }
//        System.out.println();

        String [] names = {"Nico", "Dr. Martin", "Ash"};
        print(names);
//        for(int i = 0; i < names.length; i++) {
//            System.out.print(names[i] + " ");
//        }
//        System.out.println();
//        System.out.println("second name in names array: " + names[1]);

        String [] words = new String[3];
        for(int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
        words[0] = "hello";
        words[1] = "goodbye";
        words[2] = "hola";
//        words[3] = "ciao";

        boolean [] truths = new boolean[5];
        System.out.println(truths[0]);
    }



    public static void print(int [] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void print(double [] u) {
        for(int i = 0; i < u.length; i++) {
            System.out.print(u[i] + " ");
        }
        System.out.println();
    }

    public static void print(String [] s) {
        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}
