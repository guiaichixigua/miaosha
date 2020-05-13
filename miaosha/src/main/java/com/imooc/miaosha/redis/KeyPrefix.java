package com.imooc.miaosha.redis;

public interface KeyPrefix {
    public int expireSecconds();
    public String getPrefix();
}
