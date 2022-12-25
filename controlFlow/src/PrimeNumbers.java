/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 10/19/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class PrimeNumbers {

    public static void main(String[] args) {

        int count = 0;
        for(int i=0;i<76;i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " +i+" is prime number");
                if(count==3){
                    System.out.println("Exiting the loop");
                    break;
                }
            }

        }
    }



    public static boolean isPrime(int n) {


        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }
       return true;
    }

}
