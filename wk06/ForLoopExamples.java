package wk06;

public class ForLoopExamples {
    public static void main(String[] args) {
        int count = 1;
        while(count <= 10) {
            System.out.print(count++ + " ");
//            count++;
//            count = count + 1;
//            count += 1;
        }
        System.out.println();
        double u = 15/2;
        System.out.println("u = " + u);
//        5;
//        double v = u++;

//        while(false) {
//            System.out.println("hello");
//        }

        do {
            System.out.println("goodbye");
        } while(false);

        String s1 = "hello";
        System.out.println(s1 + " goodbye");
        System.out.println(s1);
//        int i;
        for(int i = 0; i < 10;++i) {
//            System.out.print(" " + (i + 1)); // addition
//            System.out.print((" " + i) + 1); // concatenation
//            System.out.print(" " + i + 1);   // concatenation
            System.out.print(i + 1 + " ");
            if(i % 2 == 0) {
                continue;
            }
//            i++;
        }
//        System.out.println(i);
//        for(;true;) System.out.println("hello");
        System.out.println();
    }
}
