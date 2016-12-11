package com.lwhtarena.taotaomall.controller;

import com.lwhtarena.taotaomall.common.pojo.EUTreeNode;
import com.lwhtarena.taotaomall.common.pojo.TaotaoResult;
import com.lwhtarena.taotaomall.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.controller
 * @date 2016/12/8.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 * <p>内容分类管理</p>
 */
@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

    @Autowired
    private ContentCategoryService contentCategoryService;

    /**
     * @param parentId
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<EUTreeNode> getContentCatList(@RequestParam(value = "id",defaultValue = "0") Long parentId){
        List<EUTreeNode> list =contentCategoryService.getCategoryList(parentId);
        return list;
    }

    @RequestMapping("/create")
    @ResponseBody
    public TaotaoResult createContentCategory(Long parentId,String name){
        TaotaoResult result =contentCategoryService.insertContentCategory(parentId, name);
        return result;
    }

}
