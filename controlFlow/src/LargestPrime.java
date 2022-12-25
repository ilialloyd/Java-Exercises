/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/6/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(46));
    }

    public static int getLargestPrime (int number) {
        if (number<2) return -1;
        for (int i=number/2; i>1; i--) {
            if(number%i==0) number=i;
        }
        return number;
    }



}
