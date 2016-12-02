package com.lwhtarena.taotaomall.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.service
 * @date 2016/12/3.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface PictureService {
    Map uploadPicture(MultipartFile uploadFile);
}