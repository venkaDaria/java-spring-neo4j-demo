package com.example.venka.demo.model;

import org.jetbrains.annotations.Contract;

public final class NullMessage extends Message {

    private static final String TEXT = "null message";

    private NullMessage() {
        super();
        setText(TEXT);
    }

    @Contract(pure = true)
    public static NullMessage getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    private static class SingletonHolder {
        private static final NullMessage HOLDER_INSTANCE = new NullMessage();
    }
}
