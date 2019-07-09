package Ex4Computer;

public class Laptop extends Computer {
    private double screen;
    private boolean retine;


    public Laptop(final int power, final String manufacturer, final EProcessor processor, final double screen, final boolean retine) {
        super(power, manufacturer, processor);
        this.screen = screen;
        this.retine = retine;
    }

    public double getScreen() {
        return screen;
    }

    public boolean isRetine() {
        return retine;
    }
}
