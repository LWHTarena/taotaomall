package com.lwhtarena.taotaomall.controller;

import com.lwhtarena.taotaomall.common.pojo.EUTreeNode;
import com.lwhtarena.taotaomall.service.ItemCatService;
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
 * <p>商品分类管理</p>
 */

@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    private List<EUTreeNode> getCatList(@RequestParam(value = "id",defaultValue = "0") Long parentId){
        List<EUTreeNode> list =itemCatService.getCatList(parentId);
        return list;
    }

}
