
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/2/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class AllFactors {

    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        printFactors(10);

    }

    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid value");
        }
        for(int i=1;i<=number;i++){
           if(number%i==0){
               System.out.print(i+" ");
           }
        }
    }
}
