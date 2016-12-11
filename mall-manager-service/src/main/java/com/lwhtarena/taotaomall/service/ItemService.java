package com.lwhtarena.taotaomall.service;

import com.lwhtarena.taotaomall.pojo.TbItem;
import com.lwhtarena.taotaomall.common.pojo.EUDataGridResult;
import com.lwhtarena.taotaomall.common.pojo.TaotaoResult;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.service
 * @date 2016/12/3.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface ItemService {

    TbItem getItemById(long itemId);
    EUDataGridResult getItemList(int page, int rows);
    TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;

}