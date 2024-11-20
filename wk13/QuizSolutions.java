package wk13;

public class QuizSolutions {

    public static void main(String[] args) {
        int [][] x = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumEvens(x));
        sumEvensAndOdds(x);
    }


    public static void sumEvensAndOdds(int [][] data) {
        int evenSum = sumEvens(data);
        int totalSum = sum(data);
        int oddSum = totalSum - evenSum;
        System.out.println("oddSum = " + oddSum);
        System.out.println("evenSum = " + evenSum);
        System.out.println("totalSum = " + totalSum);
    }

    public static int sumEvens(int [][] data) {
        int sum = 0;
        for(int r = 0; r < data.length; r++) {
            for(int c = 0; c < data[r].length; c++) {
                if(data[r][c] % 2 == 0) {
                    sum += data[r][c];
                }
            }
        }
        return sum;
    }

    public static int sum(int [][] data) {
        int sum = 0;
        for(int r = 0; r < data.length; r++) {
            for(int c = 0; c < data[r].length; c++) {

                sum += data[r][c];

            }
        }
        return sum;
    }
}
