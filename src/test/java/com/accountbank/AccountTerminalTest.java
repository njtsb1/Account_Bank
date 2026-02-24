package com.accountbank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTerminalTest {

    @Test
    public void testBalanceFormatting() {
        double balance = 237.48;
        String formatted = String.format("%.2f", balance);
        assertEquals("237.48", formatted);
    }
}
