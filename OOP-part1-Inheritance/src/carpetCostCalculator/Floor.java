package carpetCostCalculator;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/24/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Floor {
    private double width;
    private double length;


    public Floor(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.length = height < 0 ? 0 : height;
    }

    public double getArea(){
        return width* length;
    }
}
