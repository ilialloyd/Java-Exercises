package string;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/25/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class StringFormatting {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t    \n");

        String hello = "Hello World";
        System.out.printf("index of r = %d %n", hello.indexOf('r'));
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {//empty means there is event to any white space
            System.out.println("String is empty");
            return;//finish the method
        }

        if (string.isBlank()) {//no characters but white space
            System.out.println("String is Blank");
        }

        //length start from 1 char index start from 0
        System.out.printf("First char = %c %n", string.charAt(length - 1));
    }
}
