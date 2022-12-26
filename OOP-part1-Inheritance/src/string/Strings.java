package string;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/25/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Strings {
    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\u2022 Sub Point";

        System. out. println(bulletIt);


        String textBlock ="""
                Print a Bulleted List:
                  \t\u2022 First Point
                  \t\u2022 Sub Point """;


        System.out.println(textBlock);

        int age = 28;
        System.out.printf("Your are is %d\n",age);

        int yearOfBirth = 2022-age;
        System.out.printf("Your age is %d and your birth year is %d\n",age,yearOfBirth);

        for(int i=1;i<=100000;i*=10){
            System.out.printf("%6d %n",i);
        }

        System.out.println();

        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);

        formattedString = "Your birth year is %d".formatted(yearOfBirth);
        System.out.println(formattedString);

    }
}
