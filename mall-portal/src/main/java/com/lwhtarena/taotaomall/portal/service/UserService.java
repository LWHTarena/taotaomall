package com.lwhtarena.taotaomall.portal.service;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @folder com.lwhtarena.taotaomall.portal.service
 * @Date: 2016/12/12 1:56
 * @Description:<p></p>
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface UserService {
    TbUser getUserByToken(String token);
}
