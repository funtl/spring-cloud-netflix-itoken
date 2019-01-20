package com.funtl.itoken.service.sso.service.consumer.fallback;

import com.funtl.itoken.service.sso.service.consumer.RedisCacheService;
import org.springframework.stereotype.Component;

@Component
public class RedisCacheServiceFallback implements RedisCacheService {
    @Override
    public String put(String key, String value, long seconds) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }
}
