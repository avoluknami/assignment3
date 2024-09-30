public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(123456, "John Doe");

        account.deposit(500.00);
        account.withdraw(200.00);
        account.deposit(150.00);

        System.out.println("Current Balance: " + account.getBalance());
        account.printTransactionHistory();
    }

}
