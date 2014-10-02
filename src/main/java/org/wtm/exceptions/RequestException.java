package org.wtm.exceptions;

/**
 * Created by dovbysh on 08.08.14.
 */
public class RequestException extends Exception{

    public RequestException(String message) {
        super(message);
    }

    public RequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestException(Throwable cause) {
        super(cause);
    }

}
