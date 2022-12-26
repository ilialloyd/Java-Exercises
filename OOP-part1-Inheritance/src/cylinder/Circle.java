package cylinder;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/26/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Circle {
private double radius;

    public Circle(double radius) {
        this.radius = radius <0 ? 0 : radius;
    }



    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
