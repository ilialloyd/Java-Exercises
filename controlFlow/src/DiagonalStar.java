/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/7/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 * Write a method named printSquareStar with one parameter of type int named number
 * If number is < 5, the method should print "Invalid Value".
 * The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
 */
public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }
//    IF COL = NUMBER || ROW = NUMBER DO "*"
//    IF COL = ROW DO "*"
//
//    IF COL = 1|| ROW = 1 DO "*"
//
//    IF COL = NUMBER - ROW + 1  DO "*"
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }


        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {
                if ((column==number || row==number )||((row==column)
                        ||(column==1 || row==1)|| (column==number-row+1))) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }
}
