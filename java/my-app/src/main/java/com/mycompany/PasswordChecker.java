package com.mycompany;

public class PasswordChecker {


    public boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (password.length() > 20) {
            return false;
        }
        if (!password.matches(".*[a-z].*")) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        if (!password.matches(".*[0-9].*")) {
            return false;
        }
        if (!password.matches(".*[!@#$%^&*()_+=-].*")) {
            return false;
        }
        
        return true;
    }
    
}
