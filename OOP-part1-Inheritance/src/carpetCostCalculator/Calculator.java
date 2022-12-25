package carpetCostCalculator;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/24/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
      return floor.getArea()*carpet.getCost();
    }
}
