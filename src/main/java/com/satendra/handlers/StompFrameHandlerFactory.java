package com.satendra.handlers;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.stomp.StompCommand;
import io.netty.handler.codec.stomp.StompHeaders;


public interface StompFrameHandlerFactory {
    StompCommand getCommand();

    StompFrameHandler create(ChannelHandlerContext context, StompHeaders headers, ByteBuf content);
}
