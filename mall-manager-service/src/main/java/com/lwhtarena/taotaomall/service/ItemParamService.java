package com.lwhtarena.taotaomall.service;

import com.lwhtarena.taotaomall.TbItemParam;
import com.lwhtarena.taotaomall.common.pojo.TaotaoResult;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.service
 * @date 2016/12/3.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface ItemParamService {
    TaotaoResult getItemParamByCid(long cid);
    TaotaoResult insertItemParam(TbItemParam itemParam);
}