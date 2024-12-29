package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccount3Test {

    @Test
    void testDeposit() {
        BankAccount3 account = new BankAccount3();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.01);
    }

    @Test
    void testWithdrawSuccess() {
        BankAccount3 account = new BankAccount3();
        account.deposit(100.0);
        boolean success = account.withdraw(50.0);
        assertTrue(success);
        assertEquals(50.0, account.getBalance(), 0.01);
    }

    @Test
    void testWithdrawFailure() {
        BankAccount3 account = new BankAccount3();
        account.deposit(100.0);
        boolean success = account.withdraw(60.0);
        account.withdraw(50.0); // Brings balance to 50.0
        success = account.withdraw(60.0);
        assertFalse(success);
        assertEquals(50.0, account.getBalance(), 0.01);
    }
}
