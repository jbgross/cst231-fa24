package wk15;

public class ObjectMain {
    public static void main(String[] args) {
        Marker red1 = new Marker("red");
        System.out.println(red1.getColor());
//        red1.setColor("red");
        System.out.println(red1.getColor());

        Marker blue1 = new Marker("blue");
//        blue1.setColor("orange");
        System.out.println(blue1.getColor());
        System.out.println(red1.getColor());
        System.out.println(red1.getInkMilliliters());
        red1.write("hello world");
        System.out.println(red1.getInkMilliliters());
        System.out.println(red1.isOpen());
//        System.out.println(blue1.getInkMilliliters());
    }
}
