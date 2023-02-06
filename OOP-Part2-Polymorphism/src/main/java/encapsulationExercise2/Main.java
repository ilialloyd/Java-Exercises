package encapsulationExercise2;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 2/1/2023
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("Initial page count = "+printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current job Pages: %d, Printer total: %d %n",pagesPrinted,printer.getPagesPrinted());


    }
}
