package turism.exceptions;

public class TurismExceptions extends Exception{
    public TurismExceptions() {
        super();
    }
    public TurismExceptions(String message, Throwable cause, boolean enableSuppression,
                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    public TurismExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    public TurismExceptions(String message) {
        super(message);
    }
    public TurismExceptions(Throwable cause) {
        super(cause);
    }

}