package poolArea;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/26/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public double getHeight() {
        return height;
    }
}
