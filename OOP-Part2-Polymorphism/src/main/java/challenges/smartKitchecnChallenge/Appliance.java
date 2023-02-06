package challenges.smartKitchecnChallenge;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 1/5/2023
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Appliance {
       private boolean hasWorkToDo;
    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

 class CoffeeMaker extends Appliance{
    public void brewCoffee(){
        if(this.isHasWorkToDo()==true)
        System.out.println("Coffee is brewing");
        else
            System.out.println("Water needed");
    }
}

 class DishWasher extends Appliance{

    public void doDishes(){
        if(this.isHasWorkToDo()==true)
            System.out.println("Dishes started to wash");
        else
            System.out.println("No dishes inside");
    }
}

 class Refrigerator extends Appliance{

    public void pourMilk(){
        this.setHasWorkToDo(true);
        System.out.println("Refrigerator starting to pour milk");
    }
     public void orderFood() {
         if (this.isHasWorkToDo() == true) {
             System.out.println("Food is ordering now");
         }
     }
}

