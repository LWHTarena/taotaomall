package com.lwhtarena.taotaomall.common.pojo;

import java.util.List;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.common.pojo
 * @date 2016/12/3.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 * <p>接收分页参数，一个是page一个是rows。调用dao查询商品列表。并分页。返回商品列表。
 * 返回一个EasyUIDateGrid支持的数据格式。封装成easyui的datagrid值，便于传参</p>
 */
public class EUDataGridResult {
    private long total;
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
