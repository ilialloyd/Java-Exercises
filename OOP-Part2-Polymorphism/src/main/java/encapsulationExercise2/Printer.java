package encapsulationExercise2;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 2/1/2023
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerLevel + tonerAmount;
        if (tempAmount > 100 || tempAmount < 0)
            return -1;

        tonerLevel += tonerAmount;

        return tonerLevel;
    }


    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        if (pagesPrinted % 2 == 0) {
            duplex = true;
            System.out.println("It is a duplex printer");
        }
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
