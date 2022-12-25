/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 10/19/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(1));
    }

    public static int sumDigits(int number) {

        int sum=0;

        if(number<10){
            return -1;
        }
       while (number>0){
           int digit = number%10;
           number = number/10;
           sum+=digit;
       }
       return sum;


    }

}
