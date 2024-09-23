package wk05;

public class SimpleLoop {
    public static void main(String[] args) {
        int countDown = 0;
        while(countDown < 5) {
            System.out.println(5 - countDown);
            countDown++;
        }
        System.out.println("done");
    }
}
