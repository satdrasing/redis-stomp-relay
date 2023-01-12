package com.satendra.helpers;

import io.netty.channel.ChannelHandlerContext;


public class Listener {

  public static String getListenerUniqueId(ChannelHandlerContext context, String subId){

    return String.format("%s@%s", subId, context.channel().remoteAddress());
  }
}
