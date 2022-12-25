import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/10/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

//    public static void inputThenPrintSumAndAverage() {
//        Scanner sc = new Scanner(System.in);
//        int number = 0;
//        int sum = 0;
//        int average = 0;
//        int count = 0;
//
//        while (true) {
//            try {
//                number = sc.nextInt();
//                sum += number;
//                count++;
//            } catch (ArithmeticException e) {
//                System.out.println("SUM=0 AVG=0");
//                break;
//            } catch (InputMismatchException e) {
//                sc.next();
//                if (sum != 0) {
//                    average = (int) Math.round((double) (sum / count));
//                    System.out.println("SUM = " + sum + " AVG = " + average);
//                }
//            }
//        }
//
//    }
public static void inputThenPrintSumAndAverage(){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;

    while(scanner.hasNextInt()){
        sum += scanner.nextInt();
        count++;
        // scanner.nextLine(); // not really needed because we don't need to print an alert for invalid number
        // however, inputting multiple numbers separated by space will add all numbers
    }
    System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
    scanner.close();
}
}




