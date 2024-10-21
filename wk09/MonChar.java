package wk09;

public class MonChar {
    public static void main(String[] args) {
        char x = 'c';
        char y = ' ';
        String shortest = "";
        for(char i = 100; i < 110; i++) {
            System.out.print(i);
        }
        System.out.println();

        char smallA = 'a';
        char bigA = 'A';
        System.out.println(Math.max(smallA, bigA));
        if(smallA > bigA) {
            System.out.println(smallA + " is bigger");
        } else {
            System.out.println(bigA + " is bigger");
        }

        int z = 'z';
        System.out.println(z);
        char foo = 122;
        char grault = 1;
        System.out.println(foo - 1);
        System.out.println(foo - grault);
        char quux = 65;
        System.out.println(++quux);
        int bar = 98;
        System.out.println((char) bar);
    }

}
