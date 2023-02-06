package exercise;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 1/8/2023
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
