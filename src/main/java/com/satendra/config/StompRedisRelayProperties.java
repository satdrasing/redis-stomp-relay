package com.satendra.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("stomp-redis-relay")
@Data
public class StompRedisRelayProperties {
    int port = 61613;

    int maxContentLength = 1024 * 64;

    String channelPrefix = "/topic/";

    String redisChannelPrefix = "stomp:";

    String contentType = "application/json";

    public int getPort() {
        return port;
    }

    public int getMaxContentLength() {
        return maxContentLength;
    }

    public String getChannelPrefix() {
        return channelPrefix;
    }

    public String getRedisChannelPrefix() {
        return redisChannelPrefix;
    }

    public String getContentType() {
        return contentType;
    }
}
