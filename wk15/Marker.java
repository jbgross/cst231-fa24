package wk15;

public class Marker {
    private String color;
    private int inkMilliliters;
    private boolean open;

    public Marker(String c) {
        System.out.println("I'm creating a Marker object of color " + c + "!");
        inkMilliliters = 100;
        open = false;
        color = c;
    }

    public int getInkMilliliters() {
        return inkMilliliters;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public void open() {
        open = ! open;
    }

    public boolean isOpen() {
        return open;
    }

    public void write(String s) {
        if(open) {
            System.out.println("writing the message " + s);
            inkMilliliters -= s.length();
        } else {
            System.out.println("I'm not open!");
        }

    }
}
