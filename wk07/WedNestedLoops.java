package wk07;

public class WedNestedLoops {
    public static void main(String[] args) {
        int size = 7;
        for(int i = 0; i < size; i++) {
            for(int k = 0; k < size; k++) {
//                if(k == 1) {
//                    break;
//                }
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("done");
        int row = 0;
        int col = 0;
        while(row < size) {
            col = 0;
            while(col < size) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        System.out.println("done");
        for(int i = 0; i < 9; i++) {
            System.out.print("* ");
            if((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println("done");

        /*
        . . .
        . .
        .
         */
        for(int i = 0; i < size; i++) {
            for(int k = i; k < size; k++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }


}
