package bankAccount;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/23/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount() {
    }

    @Override
    public String toString() {
        return "bankAccount.BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double in) {
        accountBalance += in;
        System.out.println( "Deposit of $" +in+
                " processed, Current balance = $" + accountBalance);
    }

    public void withdraw(int out) {
        double balance = accountBalance - out;
        if (balance < 0)
            System.out.println( "Insufficient Funds! You only have $" +accountBalance +
                           " in your account. ");
        else {
            accountBalance -= out;
            System.out.println( "Withdrawal of $" +out+
                   " processed, Remaining balance = $" + accountBalance);
        }
    }
}
