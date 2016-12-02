package com.lwhtarena.taotaomall.service;

import com.lwhtarena.taotaomall.common.pojo.EUTreeNode;

import java.util.List;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.service
 * @date 2016/12/3.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface ItemCatService {

    List<EUTreeNode> getCatList(long parentId);
}