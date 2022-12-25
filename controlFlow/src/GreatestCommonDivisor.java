import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/2/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor2(153, 81));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        List<Integer> commonDivisors = new ArrayList<>();


        for (int i = 1; i < first; i++) {
            if (first % i == 0 && second % i == 0) {
                commonDivisors.add(i);
            }
        }

        System.out.println("All Common divisors: " + commonDivisors);

        //return greatest common divisor
        return Collections.max(commonDivisors);
    }

    //The Euclidean Algorithm
    public static int getGreatestCommonDivisor2(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        while (first != second) {
            if (first > second)
                first = first - second;
            else
                second = second - first;
        }
        return second;
    }
}
