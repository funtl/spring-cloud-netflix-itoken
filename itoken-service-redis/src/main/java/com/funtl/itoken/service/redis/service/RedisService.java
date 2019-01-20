package com.funtl.itoken.service.redis.service;

public interface RedisService {
    /**
     * @param key
     * @param value
     * @param seconds 超时时间
     */
    public void put(String key, Object value, long seconds);

    public Object get(String key);
}
