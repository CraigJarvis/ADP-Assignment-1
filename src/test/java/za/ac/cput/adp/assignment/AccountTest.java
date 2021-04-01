/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.adp.assignment.Account;

/**
 *
 * @author Craig Jarvis
 */
public class AccountTest {
    
    private Account account1;
    private Account account2;
    private Account account3;
    
    @BeforeEach
    public void setUp() {
        account1 = new Account();
        account2 = new Account();
        account3 = account1;
    }
    
    @Test
    public void testIdentity() {
        assertSame(account1, account3);
    }
    
    @Test
    public void testEquality() {
        assertEquals(account1, account3);
    }
    
    @Test
    public void testFail() {
        assertEquals(account1, account3);
        fail("The test case is a prototype.");
    }

    @Test
    @Timeout(value = 50, unit = TimeUnit.MILLISECONDS)
    void testFailTimeout() {
    }
    
    @Test
    @Disabled
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testFailTimeoutAgain() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
