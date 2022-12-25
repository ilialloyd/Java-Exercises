/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 10/24/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
    }
    public static boolean isPalindrome(int number) {
        int storedNumber =number;

        int reverseNum=0;
        int lastDigit;

        while(number!=0){
            lastDigit = number%10;
            reverseNum=(reverseNum*10)+lastDigit;
            number=number/10;
        }
        System.out.println(reverseNum);
        System.out.println(storedNumber);

        return  storedNumber == reverseNum ;
    }
}
