package org.wtm.exceptions;

/**
 * Created by dovbysh on 02.10.14.
 */
public class InputParameterException extends Exception {


    public InputParameterException(String message) {
        super(message);
    }

    public InputParameterException(String message, Throwable cause) {
        super(message, cause);
    }
}
