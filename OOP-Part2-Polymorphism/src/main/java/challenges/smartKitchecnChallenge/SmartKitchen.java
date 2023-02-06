package challenges.smartKitchecnChallenge;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 1/5/2023
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class SmartKitchen  {
   private Refrigerator refrigerator;
   private CoffeeMaker coffeeMaker;
   private DishWasher dishWasher;

    public SmartKitchen() {
         refrigerator = new Refrigerator();
         coffeeMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
    }

    //Way 1
    public void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
        System.out.println("Dishes inside dishwasher");

    }
    public void addWater(){
        coffeeMaker.setHasWorkToDo(true);
        System.out.println("Water adding to CoffeeMaker");
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }
    public DishWasher getDishWasher() {
        return dishWasher;
    }

//    Way 2
    public void orderFood() {
        refrigerator.pourMilk();
        if (refrigerator.isHasWorkToDo() == true) {
            System.out.println("Food is ordering now");
        }
    }

    //Way 3
    public void setKitchenState(boolean fridgeFlag, boolean cofeeFlag,boolean dishWasherFlag){
        refrigerator.setHasWorkToDo(fridgeFlag);
        coffeeMaker.setHasWorkToDo(cofeeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        refrigerator.orderFood();
        dishWasher.doDishes();
        coffeeMaker.brewCoffee();
    }

}
