package course2_work_4;

public class WrongLoginExeption extends RuntimeException {
    public WrongLoginExeption() {
    }

    public WrongLoginExeption(String message) {
        super(message);
    }

    public WrongLoginExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongLoginExeption(Throwable cause) {
        super(cause);
    }

    public WrongLoginExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
