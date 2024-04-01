package edu.postech.csed409h;

import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Banking System Tests")
class BankingSystemTest {
    private Bank bank;
    private Account account1;
    private Account account2;

    // This method runs before each test method in this class.
    @BeforeEach
    void setUp() {
        System.out.println("Before Each - This runs before each test");
        bank = new Bank();
        account1 = new Account("John", 1000);
        // Hint: Should create a new account
        bank.addAccount(account1);
        // Hint: Should add new account to bank
    }

    @AfterEach
    void tearDown() {
        bank = null;
    }

    @Test
    @DisplayName("Test deposit and withdraw in an account")
    void testAccountDepositWithdraw() {
        // Hint: Deposit an amount and then assert that the balance has increased correctly.
        // Next, withdraw an amount and assert that the balance has decreased correctly.
    }

    @Test
    @DisplayName("Test transferring funds between accounts")
    void testTransferFunds() {
        // Hint: Implement a transfer of funds from one account to another and assert that both balances have updated correctly.
    }

    @Test
    @DisplayName("Test adding and retrieving accounts from the bank")
    void testAddRetrieveAccount() {
        // Hint: Add accounts to the bank and then retrieve them. Check if the retrieved accounts match the added accounts.
    }

    @Test
    @DisplayName("Test insufficient balance during transfer")
    void testInsufficientBalanceDuringTransfer() {
        // Hint: Attempt a transfer that should fail due to insufficient balance. Check that an exception is thrown.
    }

    @Test
    @DisplayName("Test negative deposit amount")
    void testNegativeDepositAmount() {
        // Hint: Attempt to deposit a negative amount. Check that an exception is thrown.
    }

    @Test
    @DisplayName("Test negative withdraw amount")
    void testNegativeWithdrawAmount() {
        // Hint: Attempt to withdraw a negative amount. Check that an exception is thrown.
    }
}