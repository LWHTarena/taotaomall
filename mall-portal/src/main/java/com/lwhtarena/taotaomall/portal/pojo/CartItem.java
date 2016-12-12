package com.lwhtarena.taotaomall.portal.pojo;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @folder com.lwhtarena.taotaomall.portal.pojo
 * @Date: 2016/12/12 1:51
 * @Description:<p></p>
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public class CartItem {
    private long id;
    private String title;
    private Integer num;
    private long price;
    private String image;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
        this.num = num;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}
