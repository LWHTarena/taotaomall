package com.lwhtarena.taotaomall.common.pojo;

import java.util.List;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.common.pojo
 * @date 2016/12/3.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
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
