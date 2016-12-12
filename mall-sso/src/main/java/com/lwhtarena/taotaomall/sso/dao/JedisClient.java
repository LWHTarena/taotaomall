package com.lwhtarena.taotaomall.sso.dao;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @folder com.lwhtarena.taotaomall.sso.dao
 * @Date: 2016/12/12 23:05
 * @Description:<p></p>
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface JedisClient {
    String get(String key);
    String set(String key, String value);
    String hget(String hkey, String key);
    long hset(String hkey, String key, String value);
    long incr(String key);
    long expire(String key, int second);
    long ttl(String key);
    long del(String key);
    long hdel(String hkey, String key);
}
