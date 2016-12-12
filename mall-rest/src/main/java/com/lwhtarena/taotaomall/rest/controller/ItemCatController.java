package com.lwhtarena.taotaomall.rest.controller;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @folder com.lwhtarena.taotaomall.rest.controller
 * @Date: 2016/12/12 2:23
 * @Description:<p>商品分类列表</p>
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */

@Controller
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;

    /*@RequestMapping(value="/itemcat/list",
            produces=MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    @ResponseBody
    public String getItemCatList(String callback) {
        CatResult catResult = itemCatService.getItemCatList();
        //把pojo转换成字符串
        String json = JsonUtils.objectToJson(catResult);
        //拼装返回值
        String result = callback + "(" + json + ");";
        return result;
    }*/
    @RequestMapping("/itemcat/list")
    @ResponseBody
    public Object getItemCatList(String callback) {
        CatResult catResult = itemCatService.getItemCatList();
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
        mappingJacksonValue.setJsonpFunction(callback);
        return mappingJacksonValue;
    }
}
