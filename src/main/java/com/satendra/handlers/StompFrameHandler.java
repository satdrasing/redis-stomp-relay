package com.satendra.handlers;

import io.netty.handler.codec.stomp.DefaultStompFrame;


public interface StompFrameHandler {
    DefaultStompFrame getResponse();

    boolean isCloseAfterResponse();

    StompFrameHandler invoke();
}
