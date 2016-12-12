package com.lwhtarena.taotaomall.rest.controller;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @folder com.lwhtarena.taotaomall.rest.controller
 * @Date: 2016/12/12 2:25
 * @Description:<p>缓存同步Controller</p>
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */

@Controller
@RequestMapping("/cache/sync")
public class RedisController {
    @Autowired
    private RedisService redisService;

    @RequestMapping("/content/{contentCid}")
    @ResponseBody
    public TaotaoResult contentCacheSync(@PathVariable Long contentCid) {
        TaotaoResult result = redisService.syncContent(contentCid);
        return result;
    }
}
