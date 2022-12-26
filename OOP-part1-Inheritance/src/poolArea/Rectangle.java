package poolArea;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/26/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    public double getArea(){
        return width*length;
    }


    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
