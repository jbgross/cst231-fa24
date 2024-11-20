package wk13;

public class WedCharFun {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//            printLetters(args[i]);
            String s = clean(args[i]);
            System.out.println(s);
            String encrypted = encrypt(s, 25);
            System.out.println(encrypted);
        }
    }

    public static String clean(String s) {
        String t = "";
        String u = s.toUpperCase();
        for(int i = 0; i < u.length(); i++) {
            char c = u.charAt(i);
            if(isLetter(c)){
                t += c;
            }
        }
        return t;
    }

    public static String encrypt(String s, int shift) {
        String t = "";
        for(int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            // remove offset
            x -= 65;
            // add in shift
            x += shift;
            // rotate - make sure that the number is within the uppercase letter
            x %= 26;
            // add back the offset
            x += 65;
            t += x;
        }
        return t;
    }

    public static boolean isLetter(char c) {
        return c >= 65 && c <= 90;
    }

    public static void printLetters(String s) {
        for(int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }
}
