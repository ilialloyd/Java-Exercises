package challenges.smartKitchecnChallenge;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 1/6/2023
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Main {

    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

        // Way 1: doing things  Main method
//        smartKitchen.loadDishwasher();
//        smartKitchen.getDishWasher().doDishes();
//
//        smartKitchen.addWater();
//        smartKitchen.getCoffeeMaker().brewCoffee();

        //Way 2: doing things in Kitchen
//        smartKitchen.orderFood();

        smartKitchen.setKitchenState(true,false,true);
        smartKitchen.doKitchenWork();
    }

}
