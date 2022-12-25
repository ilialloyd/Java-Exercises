/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 10/24/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(15));
    }
    public static int sumFirstAndLastDigit(int number) {
        int lastDigit;
        int sum = 0;

        if(number<0){
            return -1;
        }
        lastDigit = number % 10;

        while (number > 9) {//this will give us last digit
            number = number / 10;
        }
        sum = lastDigit + number;


        return sum;
    }
}
