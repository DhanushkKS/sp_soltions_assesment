package org.dhanush.newswbsite.Exceptions;

/**
 * Author Dhanush
 * Created At 10/10/2024 11:59
 */
public class NewsNotFoundException extends RuntimeException {

    // Default constructor with a default message
    public NewsNotFoundException() {
        super("News item not found.");
    }

    // Constructor that accepts a custom message
    public NewsNotFoundException(String message) {
        super(message);
    }
}
