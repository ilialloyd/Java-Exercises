package challange1;

import java.text.ParseException;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/25/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) throws ParseException {

        Employee tim = new Employee("Tim","11/11/1995","01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+ tim.getAge());
        System.out.println("Pay = "+tim.collectPay());


        SalariedEmployee joe = new SalariedEmployee("Joe","21/10/1980","15/04/2019",35000);
        System.out.println(joe);
        System.out.println("Joe's paycheck = $ "+joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check = $"+joe.collectPay());

        HourlyEmployee merry = new HourlyEmployee("Merry","05/05/1975","03/05/2005",15);

        System.out.println(merry);
        System.out.println("Merry's Paycheck = $"+merry.collectPay());
        System.out.println("Merry's holiday pay = $"+merry.getDoublePay());

    }
}
