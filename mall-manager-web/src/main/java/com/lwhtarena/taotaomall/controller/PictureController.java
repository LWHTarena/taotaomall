package com.lwhtarena.taotaomall.controller;

import com.lwhtarena.taotaomall.common.utils.JsonUtils;
import com.lwhtarena.taotaomall.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.controller
 * @date 2016/12/9.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 * <p>上传图片处理</p>
 */

@Controller
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public String pictureUpload(MultipartFile uploadFile) {
        Map result =pictureService.uploadPicture(uploadFile);
        //为了保证功能的兼容性，需要把Result转换成json格式的字符串。
        String json = JsonUtils.objectToJson(result);
        return json;
    }
}
