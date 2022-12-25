import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/6/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class ReadingUserInput_System_Console {
    public static void main(String[] args) {
        int year = 2022;
        try {
            System.out.println(getInputFromConsole(year));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(year));
        }
    }

    // if you use System.console() then you need to run code from terminal
    //For this exact class we run this way every time:
    // java src/ReadingUserInput_System_Console.java

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name?\n");
        System.out.println("Hi, " + name + ", Thanks for taking your time!");

        String dob = System.console().readLine("What year were you born?\n");
        int age = currentYear - Integer.parseInt(dob);
        return "So, you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, What's your name?");
        String name = sc.nextLine();
        System.out.println("Hi, " + name + ", Thanks for taking your time!");
        System.out.println("What year were you born?");

        boolean validDOB=false;
        int age=0;
        do{
            System.out.println("Enter a year of birth >= "+
                    (currentYear-125)+" and <= "+(currentYear));
           try {
               age= checkingData(currentYear, sc.nextLine());
           }catch (NumberFormatException e){
               System.out.println("Invalid Character Entered! Try again...");
           }
            validDOB = age>0 ;
        }while (!validDOB);


        return "So, you are " + age + " years old.";
    }

    public static int checkingData(int currentYear, String DOB) {
        int dob = Integer.parseInt(DOB);
        int minimumYear = currentYear - 125;
        if (dob > currentYear || dob < minimumYear)
            return -1;

        return currentYear - dob;
    }
}
