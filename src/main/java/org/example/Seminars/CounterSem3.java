package org.example.Seminars;

import java.io.IOException;

public class CounterSem3 implements AutoCloseable {
    private int count;
    private boolean closed = false;

    public void add() throws IOException {
        if (closed){
            throw new IOException();
        }else {
            count ++;
        }
    }

    @Override
    public void close() throws Exception {
        closed = true;
    }
}
