/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 10/19/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class SumOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(5));
        System.out.println(isEvenNumber(5));

    }

    public static boolean isOdd(int number) {
//        if (number % 2 == 1) {
//            return true;
//        }
//        return false;
//
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && end > 0 && start > 0) {

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }


    public static boolean isEvenNumber(int number) {
        return number > 0 && number % 2 == 0;
    }


}
