package com.lwhtarena.taotaomall.common.pojo;

/**
 * easyUI树形控件节点格式
 * <p>Title: EUTreeNode</p>
 * @author lwh
 * @folder com.lwhtarena.taotaomall.common.pojo
 * @date 2016/12/3.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public class EUTreeNode {
    private long id;
    private String text;
    private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
