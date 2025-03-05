package org.example.Seminars;

public class DivisionByZeroException extends Exception{
    public DivisionByZeroException() {
        super("Делить на '0' нельзя");
    }
}
