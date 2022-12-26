package string;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/25/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class StringManipulation {

    public static void main(String[] args) {
        String birthDate = "25/11/1982";
    int startingIndex = birthDate.indexOf("1982");
        System.out.println("starting index = "+ startingIndex);
        System.out.println("Birth year ="+birthDate.substring(startingIndex));

        //extract month = 11
        System.out.println("Month = "+ birthDate.substring(3,5));

        //join method
        String newDate = String.join("-","23","03","1994");
        System.out.println(newDate);

        //replace method
        System.out.println(newDate.replace('-','.'));

        //repeat method
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        //indent method - space from the side
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        //indent method - space from the side
        System.out.println("ABC\n".repeat(3).indent(-5));
        System.out.println("-".repeat(20));


    }

}
