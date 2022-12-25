/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 10/25/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class GetEvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitNum(2659));
    }
    private static int getEvenDigitNum(int number){

        int sum=0;
        int anyNumber=0;


        while (number>0){
            anyNumber = number%10;

            if(anyNumber%2==0){
                sum+=anyNumber;
            }
            number=number/10;
        }


        return number <0 ? -1 : sum;
    }
}
