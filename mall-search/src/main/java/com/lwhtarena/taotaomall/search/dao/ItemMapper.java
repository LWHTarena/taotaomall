package com.lwhtarena.taotaomall.search.dao;

import com.lwhtarena.taotaomall.search.pojo.Item;

import java.util.List;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @folder com.lwhtarena.taotaomall.search.dao
 * @Date: 2016/12/12 22:45
 * @Description:<p></p>
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface ItemMapper {
    List<Item> getItemList();
}
