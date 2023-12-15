import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordCheckerTest {
    
    @Test
    public void testValidPassword() {
        PasswordChecker checker = new PasswordChecker();
        
        // Test a valid password
        assertTrue(checker.isValidPassword("Abcdefg1!"));
    }
    
    @Test
    public void testInvalidPassword() {
        PasswordChecker checker = new PasswordChecker();
        
        // Test password length less than 8
        assertFalse(checker.isValidPassword("Abcdef1!"));
        
        // Test password length greater than 20
        assertFalse(checker.isValidPassword("Abcdefghijklmnopqrst1!"));
        
        // Test password without lowercase letter
        assertFalse(checker.isValidPassword("ABCDEFG1!"));
        
        // Test password without uppercase letter
        assertFalse(checker.isValidPassword("abcdefg1!"));
        
        // Test password without digit
        assertFalse(checker.isValidPassword("Abcdefg!"));
        
        // Test password without special character
        assertFalse(checker.isValidPassword("Abcdefg1"));
    }
}