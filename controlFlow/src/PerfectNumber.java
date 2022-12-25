import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/5/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(   isPerfectNumber2(33550336));
    }

    public static boolean isPerfectNumber(int number){
        List<Integer> divisors = new ArrayList<>();
        if(number<1)
            return false;

        for(int i=1;i<number;i++){
            if(number%i==0){
                divisors.add(i);
            }
        }
        int sum = divisors.stream().mapToInt(Integer::intValue).sum();
        return number == sum;
    }

    public static boolean isPerfectNumber2(int number){
        int sum = 0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return number==sum && number>1;
    }
}
