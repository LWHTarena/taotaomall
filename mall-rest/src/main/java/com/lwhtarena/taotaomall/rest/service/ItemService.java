package com.lwhtarena.taotaomall.rest.service;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @folder com.lwhtarena.taotaomall.rest.service
 * @Date: 2016/12/12 2:27
 * @Description:<p></p>
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface ItemService {
    TaotaoResult getItemBaseInfo(long itemId);
    TaotaoResult getItemDesc(long itemId);
    TaotaoResult getItemParam(long itemId);
}
