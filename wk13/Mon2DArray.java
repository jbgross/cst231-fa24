package wk13;

public class Mon2DArray {
    public static void main(String[] args) {
        int [][] a = new int[3][5];
        int [][] b = {{1,2}, {3, 4, 5}, {6, 7, 8, 9}};
        print(b);
//        System.out.println(a);
//        System.out.println(a.length);
//        System.out.println(a[0]);
//        System.out.println(a[0][0]);
        print(a);
        System.out.println("adding data...");
        for(int row = 0; row < a.length; row++) {
            for(int col = 0; col < a[0].length; col++) {
                a[row][col] = row + col;
            }
        }
        print(a);
    }

    private static void print(int[][] a) {
        for(int row = 0; row < a.length; row++) {
            for(int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}
