import java.util.ArrayList;

/**
 * The PersonalAccount class represents a personal bank account with deposit and withdrawal functionality,
 * as well as transaction history tracking.
 */
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    /**
     * Constructs a new PersonalAccount object with the specified account number and account holder.
     * The initial balance is set to 0.0 and the transaction history is initialized as an empty list.
     *
     * @param accountNumber The unique identifier for the account.
     * @param accountHolder The name of the account holder.
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    /**
     * Deposits the specified amount into the account if the amount is positive.
     * The deposit is recorded in the transaction history.
     *
     * @param amount The amount to be deposited.
     * @return true if the deposit was successful, false if the amount is invalid (e.g., negative).
     */
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Amount(amount, TransactionType.DEPOSIT));
            return true;
        } else {
            System.out.println("Cannot deposit a negative amount.");
            return false;
        }
    }

    /**
     * Withdraws the specified amount from the account if the amount is positive and does not exceed the current balance.
     * The withdrawal is recorded in the transaction history.
     *
     * @param amount The amount to be withdrawn.
     * @return true if the withdrawal was successful, false if the balance is insufficient or the amount is invalid.
     */
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Amount(amount, TransactionType.WITHDRAWAL));
            return true;
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
            return false;
        }
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Retrieves the account number.
     *
     * @return The account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Retrieves the name of the account holder.
     *
     * @return The account holder's name.
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Prints the transaction history of the account. Each transaction includes the type (deposit or withdrawal)
     * and the amount.
     */
    public void printTransactionHistory() {
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": " + transaction.getAmount());
        }
    }
}
