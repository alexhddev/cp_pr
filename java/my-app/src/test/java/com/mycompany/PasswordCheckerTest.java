package com.mycompany;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

    @Test
    public void testCheckPassword_ValidPassword_ReturnsTrue() {
        PasswordChecker passwordChecker = new PasswordChecker();
        assertTrue(passwordChecker.checkPassword("Abcdefg1!"));
    }

    @Test
    public void testCheckPassword_TooShortPassword_ReturnsFalse() {
        PasswordChecker passwordChecker = new PasswordChecker();
        assertFalse(passwordChecker.checkPassword("Abc1!"));
    }

    @Test
    public void testCheckPassword_TooLongPassword_ReturnsFalse() {
        PasswordChecker passwordChecker = new PasswordChecker();
        assertFalse(passwordChecker.checkPassword("Abcdefghijklmnopqrstuvwxyz1!"));
    }

    @Test
    public void testCheckPassword_NoLowerCaseLetter_ReturnsFalse() {
        PasswordChecker passwordChecker = new PasswordChecker();
        assertFalse(passwordChecker.checkPassword("ABCDEFG1!"));
    }

    @Test
    public void testCheckPassword_NoUpperCaseLetter_ReturnsFalse() {
        PasswordChecker passwordChecker = new PasswordChecker();
        assertFalse(passwordChecker.checkPassword("abcdefg1!"));
    }

    @Test
    public void testCheckPassword_NoDigit_ReturnsFalse() {
        PasswordChecker passwordChecker = new PasswordChecker();
        assertFalse(passwordChecker.checkPassword("Abcdefg!"));
    }

    @Test
    public void testCheckPassword_NoSpecialCharacter_ReturnsFalse() {
        PasswordChecker passwordChecker = new PasswordChecker();
        assertFalse(passwordChecker.checkPassword("Abcdefg1"));
    }
}