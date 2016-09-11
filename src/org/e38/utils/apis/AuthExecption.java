package org.e38.utils.apis;

/**
 * Created by sergi on 9/11/16.
 */
public class AuthExecption extends ApiExecption {
    public AuthExecption() {
    }

    public AuthExecption(String message) {
        super(message);
    }

    public AuthExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthExecption(Throwable cause) {
        super(cause);
    }

    public AuthExecption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
