/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 10/25/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class SameLastDigit {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,99,19));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        return (isValid(num1) && isValid(num2) && isValid(num3))&&
                (num1%10==num2%10||num1%10==num3%10||num2%10==num3%10);

    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }


}
