package cylinder;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/26/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height<0? 0:height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }
}
