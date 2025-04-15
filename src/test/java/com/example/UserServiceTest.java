
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    public void testGreetUser() {
        UserService userService = new UserService();
        String greeting = userService.greetUser("Alice");
        assertEquals("Hello, Alice!", greeting);
    }
}
