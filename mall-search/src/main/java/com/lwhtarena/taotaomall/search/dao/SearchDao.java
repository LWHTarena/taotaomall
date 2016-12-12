package com.lwhtarena.taotaomall.search.dao;

import com.lwhtarena.taotaomall.search.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @folder com.lwhtarena.taotaomall.search.dao
 * @Date: 2016/12/12 22:42
 * @Description:<p></p>
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface SearchDao {
    SearchResult search(SolrQuery query) throws Exception;
}
