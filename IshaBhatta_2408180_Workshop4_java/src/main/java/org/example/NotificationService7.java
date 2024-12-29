package org.example;

import java.util.regex.Pattern;

public class NotificationService7 {

    // Regex pattern for validating email addresses
    private static final String EMAIL_REGEX = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

    public boolean sendEmail(String email, String message) {
        if (email == null || message == null || !isValidEmail(email)) {
            return false;
        }
        // Simulate sending email (replace with actual email logic if needed)
        System.out.println("Email sent to " + email + " with message: " + message);
        return true;
    }

    private boolean isValidEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }
}

