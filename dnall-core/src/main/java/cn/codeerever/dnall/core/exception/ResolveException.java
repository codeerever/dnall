package cn.codeerever.dnall.core.exception;

public class ResolveException extends RuntimeException {

    public ResolveException(String message) {
        super(message);
    }

    public ResolveException(String message, Throwable e) {
        super(message, e);
    }

    public ResolveException() {
        super();
    }

}
