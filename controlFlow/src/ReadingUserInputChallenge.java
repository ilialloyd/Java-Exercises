import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/8/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        getUserInput();
    }

    public static void getUserInput() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        boolean isValid = false;
        int count = 1;


        do {
            try {
                System.out.println("Enter number #" + count + ": ");
                number = checkingData(Integer.parseInt(sc.nextLine()));

            } catch (NumberFormatException e) {
                System.out.println("Invalid character entered! Try Again...");


            }
            isValid = number > 0;
            if (isValid) {
                sum += number;
                count++;
            }else{
                System.out.println("Invalid Number");

            }
        } while (count <= 5);


        System.out.println("Sum of 5 numbers is: " + sum);
    }

    public static int checkingData(int number) {

        if (number <= 100 && number >= 1) {
            return number;
        }

        return -1;
    }
}
