package wk06;

public class ReviewExam1 {
    public static void main(String[] args) {
        int x;
        for(int i = 1; i < 15; i++) {
//            System.out.println("Remainder when 0 is divided by " +
//                i + ": " + (0%i));
            System.out.println("Remainder when " + i +
                    " is divided by 3: " +  (i%3));
        }
        String firstName = "Josh";
        String lastName = "";
//        float f = 0.0;
        if("one".equals("two")) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }

        if(! "one".equals("two")) {
            System.out.println("second different");
        } else {
            System.out.println("second same");
        }

        if(! (1 == 2)) {

        }

        int y = 10;
        if(y < 5) {
            System.out.println("small");
        } else {
            if(y < 10) {
                System.out.println("medium");
            } else if(y > 15) {
                System.out.println("large");
            }
//            else {
//                System.out.println("size unknown");
//            }
        }

    }
}
