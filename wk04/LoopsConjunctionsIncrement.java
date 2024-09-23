package wk04;

public class LoopsConjunctionsIncrement {
    public static void main(String[] args) {
        // create an int variable called x and set to zero
        // x will store the number of iterations a loop completes
        int x = 0;
        // == != > >= < <= && || !
        // 4 + 5
        // 4 - 5
        // 4 / 5
        // 4 % 5
        // =
        // += -= *= /= %= \
        // ++ --
        int a = 5;
        a = a + 1;
        a += 1;
        a = a - 1;
        a -= 1;
        System.out.println("a = " + a);
        int b = a++;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println();
        b++;
        ++b;
        while(++b < 10);
        while(10 > ++b);
        while(10 > b++); 
        int c = 0;
        while(c++ < 5) {
            System.out.println("c = " + c);
        }
        int d = 10;
        int e = (++d);
        int f = ++d;
        int g = (d++);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
//        while(true == false) {
//
//        }
    }
}
