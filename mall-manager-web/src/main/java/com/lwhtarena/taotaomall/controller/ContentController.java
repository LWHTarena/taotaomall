package com.lwhtarena.taotaomall.controller;

import com.lwhtarena.taotaomall.pojo.TbContent;
import com.lwhtarena.taotaomall.common.pojo.TaotaoResult;
import com.lwhtarena.taotaomall.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.controller
 * @date 2016/12/8.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 * <p>内容管理</p>
 */
@Controller
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/save")
    @ResponseBody
    public TaotaoResult insertContent(TbContent content){
        TaotaoResult result =contentService.insertContent(content);
        return result;
    }
}
