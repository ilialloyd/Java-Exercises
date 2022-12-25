package bankAccount;

/**
 * Created by IntelliJ IDEA.
 * User: ${USER}
 * Date: ${DATE}
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(500);

        bankAccount.withdraw(400);

    }
}