package org.dhanush.newswbsite.Exceptions;

/**
 * Author Dhanush
 * Created At 10/10/2024 11:59
 */
public class NewsNotFoundException extends RuntimeException {

    public NewsNotFoundException() {
        super("News item not found.");
    }

    public NewsNotFoundException(String message) {
        super(message);
    }
}
