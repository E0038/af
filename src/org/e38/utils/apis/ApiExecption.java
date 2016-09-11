package org.e38.utils.apis;

/**
 * Created by sergi on 9/11/16.
 */
public class ApiExecption extends Exception{
    public ApiExecption() {
    }

    public ApiExecption(String message) {
        super(message);
    }

    public ApiExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiExecption(Throwable cause) {
        super(cause);
    }

    public ApiExecption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
