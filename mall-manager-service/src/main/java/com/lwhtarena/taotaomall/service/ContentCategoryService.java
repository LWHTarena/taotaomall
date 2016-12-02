package com.lwhtarena.taotaomall.service;

import com.lwhtarena.taotaomall.common.pojo.EUTreeNode;
import com.lwhtarena.taotaomall.common.pojo.TaotaoResult;

import java.util.List;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.service
 * @date 2016/12/3.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface ContentCategoryService {
    List<EUTreeNode> getCategoryList(long parentId);
    TaotaoResult insertContentCategory(long parentId, String name);
}
