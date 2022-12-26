package string;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/25/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class StringBuilderExample {



    public static void main(String[] args) {
        String helloWorld = "Hello"+" World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello"+" World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
    }

    public static void printInformation(String string){
        System.out.println("String = "+string);
        System.out.println("length = "+string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = "+builder);
        System.out.println("length = "+builder.length());
    }


}
