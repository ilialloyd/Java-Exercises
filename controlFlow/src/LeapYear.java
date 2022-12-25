import java.time.YearMonth;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 10/19/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class LeapYear {
    public static void main(String[] args) {
        boolean leap = isLeapYear(2000);
        System.out.println(leap);
    }

    public static boolean isLeapYear(int year) {
        boolean is = false;

        if (year >= 1 && year <= 9999) {


            if ((year % 4 == 0) && !(year % 100 == 0)) {
                is = true;
            }else if (year % 400 == 0) {
                is = true;
            }else {
                is = false;
            }
        }else {
            is = false;
        }
        return is;

    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = 0;

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }else {
            YearMonth yearMonthObject = YearMonth.of(year, month);
            daysInMonth = yearMonthObject.lengthOfMonth();
        }
        return daysInMonth;

    }
}
