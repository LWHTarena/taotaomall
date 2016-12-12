package com.lwhtarena.taotaomall.search.service;

import com.lwhtarena.taotaomall.search.pojo.SearchResult;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @folder com.lwhtarena.taotaomall.search.service
 * @Date: 2016/12/12 22:38
 * @Description:<p></p>
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface SearchService {
    SearchResult search(String queryString, int page, int rows) throws Exception;
}
