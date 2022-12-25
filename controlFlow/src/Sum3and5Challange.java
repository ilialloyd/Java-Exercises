/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 10/19/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Sum3and5Challange {
    public static void main(String[] args) {

        int sum=0;

        int firstFiveNumbers =0;

        for (int i = 1; i <= 1000; i++) {

            if(i%3==0 && i%5==0){
                sum+=i;
                firstFiveNumbers++;
            }
            if(firstFiveNumbers==5){
                break;
            }

        }
        System.out.println(sum);
    }
}
