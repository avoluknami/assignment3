
/**
 * The PersonalAccountTest class contains unit tests for the PersonalAccount class.
 * It verifies the functionality of deposits, withdrawals, and account balance handling.
 */
public class PersonalAccountTest {

    /**
     * Tests the deposit functionality of the PersonalAccount class.
     * Verifies that a positive amount is deposited correctly and updates the balance.
     */
    @Test
    public void testDeposit() {
        PersonalAccount account = new PersonalAccount(123456, "John Doe");
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    /**
     * Tests the withdrawal functionality of the PersonalAccount class.
     * Verifies that a valid withdrawal reduces the balance correctly
     */
    @Test
    public void testWithdraw() {
        PersonalAccount account = new PersonalAccount(123456, "John Doe");
        account.deposit(200.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance());
    }

    /**
     * Tests the withdrawal functionality when the amount exceeds the balance.
     * Verifies that the withdrawal fails and the balance remains unchanged.
     */
    @Test
    public void testInsufficientBalance() {
        PersonalAccount account = new PersonalAccount(123456, "John Doe");
        account.deposit(100.0);
        boolean result = account.withdraw(200.0);
        assertFalse(result);  // Withdrawal should fail
        assertEquals(100.0, account.getBalance());  // Balance should remain unchanged
    }

    /**
     * Tests the deposit functionality with a negative amount.
     * Verifies that the deposit fails and the balance remains unchanged.
     */
    @Test
    public void testNegativeDeposit() {
        PersonalAccount account = new PersonalAccount(123456, "John Doe");
        account.deposit(-50.0);
        assertEquals(0.0, account.getBalance());  // Balance should remain unchanged
    }

    /**
     * Tests the withdrawal functionality with a negative amount.
     * Verifies that the withdrawal fails and the balance remains unchanged.
     */
    @Test
    public void testNegativeWithdrawal() {
        PersonalAccount account = new PersonalAccount(123456, "John Doe");
        account.deposit(100.0);
        boolean result = account.withdraw(-50.0);
        assertFalse(result);  // Withdrawal should fail
        assertEquals(100.0, account.getBalance());  // Balance should remain unchanged
    }
}
