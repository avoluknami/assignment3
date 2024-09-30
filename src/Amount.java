/**
 * The Amount class represents a transaction amount in a bank account.
 * It includes the amount value and the type of transaction (deposit or withdrawal).
 */
public class Amount {
    private double amount;
    private TransactionType transactionType;

    /**
     * Constructs a new Amount object with the specified amount and transaction type.
     *
     * @param amount The transaction amount.
     * @param transactionType The type of transaction (DEPOSIT or WITHDRAWAL).
     */
    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    /**
     * Retrieves the transaction amount.
     *
     * @return The transaction amount.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Retrieves the type of transaction.
     *
     * @return The transaction type (DEPOSIT or WITHDRAWAL).
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }
}
