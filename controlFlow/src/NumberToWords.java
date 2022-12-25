import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/5/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class NumberToWords {

    public static void main(String[] args) {
        // numberToWords(150);
       numberToWords(0);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }


//        System.out.println("Original number's count: " + getDigitCount(number));

        int numbersDigitCount = getDigitCount(number);
        int reverseNum = reverse(number);
//        System.out.println("Number: "+number +"--------"+" Reverse: "+reverseNum);
        int reverseDigitCount = getDigitCount(reverseNum);

//        System.out.println("Reverse number's count: " + getDigitCount(reverseNum));
//        System.out.println("Reverse number's count: " + reverse);

        String[] digit = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};


        if(number==0){
            System.out.println(digit[0]);
        }
        while (reverseNum > 0) {
            //            System.out.println("I is "+i);
            System.out.println(digit[reverseNum % 10]);
            reverseNum = reverseNum / 10;
        }


        while (reverseDigitCount < numbersDigitCount) {
            System.out.println(digit[0]);
            numbersDigitCount--;
        }
    }


    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 1;
        while (number > 9) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int reverse(int number) {
        int reverseNum = 0;
        while (number != 0) {
            reverseNum = reverseNum * 10 + number % 10;
            number = number / 10;
        }
        return reverseNum;
    }
}
