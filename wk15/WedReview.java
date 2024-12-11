package wk15;

public class WedReview {
    public static void main(String[] args) {
        int [][] a = new int[4][3];
        int [] b = {0, 1, 2, 3, 4, 178, -9};
        System.out.println(largest(b));
    }

    public static int[] largestPerRow(int [][] a) {
        int [] largestPerRow = new int[a.length];
        for(int row = 0; row < a.length; row++) {
            int largest = a[row][0];
            for(int col = 0; col < a[row].length; col++) {
                if(a[row][col] > largest) {
                    largest = a[row][col];
                }
            }
            largestPerRow[row] = largest;
        }

        return largestPerRow;
    }

    public static int [] largest(int [][] a) {
        int [] biggestValuePerRow = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            biggestValuePerRow[i] = largest(a[i]);
        }
        return biggestValuePerRow;
    }

    public static int largest(int [] a) {
        int largest = a[0];
        for(int i = 0; i < a.length; i++) {
            if(a[i] > largest) {
                largest = a[i];
            }
        }
        return largest;
    }
}
