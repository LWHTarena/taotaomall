package com.lwhtarena.taotaomall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.controller
 * @date 2016/12/9.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 * <p>页面跳转</p>
 */

@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page){
        return page;
    }
}
