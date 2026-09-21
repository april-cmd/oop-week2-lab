package com.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {

    @Test
    void depositIncreasesBalance() {
    //Arrange
    BankAccount account = new BankAccount("Jacob", 50);

    //Act
    account.deposit(100);

    //Assert
    assertEquals(150.0, account.getBalance());
}

@Test
void negativeDepositIsRejected() {
    //Arrange
    BankAccount account = new BankAccount("Jacob", 50);

    //Act and Assert
    assertThrows(IllegalArgumentException.class, () -> account.deposit(-10));

    assertEquals(50.0, account.getBalance());   // and nothing changed
}



















   // @Test
    //void testDeposit() {
        // Arrange
        //BankAccount account = new BankAccount();

        // Act
        //account.deposit(100);
        
        // Assert
        //assertEquals(100, account.balance);
    //}
}
