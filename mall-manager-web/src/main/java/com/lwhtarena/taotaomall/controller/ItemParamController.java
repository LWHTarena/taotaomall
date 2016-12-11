package com.lwhtarena.taotaomall.controller;

import com.lwhtarena.taotaomall.pojo.TbItemParam;
import com.lwhtarena.taotaomall.common.pojo.TaotaoResult;
import com.lwhtarena.taotaomall.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.controller
 * @date 2016/12/8.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 * <p>商品规格参数模板管理</p>
 */
@Controller
@RequestMapping("/item/param")
public class ItemParamController {

    @Autowired
    private ItemParamService itemParamService;

    @RequestMapping("/query/itemcatid/{itemCatId}")
    @ResponseBody
    public TaotaoResult getItemparamByCid(@PathVariable Long itemCatId){
        TaotaoResult result =itemParamService.getItemParamByCid(itemCatId);
        return result;
    }

    @RequestMapping("/save/{cid}")
    @ResponseBody
    public TaotaoResult insertItemParam(@PathVariable Long cid,String paramData){
        TbItemParam itemParam =new TbItemParam();
        itemParam.setItemCatId(cid);
        itemParam.setParamData(paramData);
        TaotaoResult result =itemParamService.insertItemParam(itemParam);
        return result;
    }
}
