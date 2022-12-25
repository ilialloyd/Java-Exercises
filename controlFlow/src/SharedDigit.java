/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 10/25/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }
    public static boolean hasSharedDigit(int num1, int num2) {

        if (((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99))) {
           return false;
        }

        return (num1%10 ==num2%10) ||(num1%10 ==num2/10) ||(num1/10 ==num2%10)|| (num1/10==num2/10);
    }
}
