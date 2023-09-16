package br.com.elton.exception;

public class DividendCannotBeZero extends RuntimeException{
    private static final long serialVersionUUID = 1L;

    public DividendCannotBeZero(String exception) {
        super(exception);
    }
}
