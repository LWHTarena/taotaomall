package com.lwhtarena.taotaomall.portal.pojo;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @folder com.lwhtarena.taotaomall.portal.pojo
 * @Date: 2016/12/12 1:52
 * @Description:<p></p>
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public class ItemInfo extends TbItem {
    public String[] getImages() {
        String image = getImage();
        if (image != null) {
            String[] images = image.split(",");
            return images;
        }
        return null;
    }
}
