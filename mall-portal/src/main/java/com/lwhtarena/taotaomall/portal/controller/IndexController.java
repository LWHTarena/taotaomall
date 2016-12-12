package com.lwhtarena.taotaomall.portal.controller;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @folder com.lwhtarena.taotaomall.portal.controller
 * @Date: 2016/12/12 2:12
 * @Description:<p></p>
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */

@Controller
public class IndexController {
    @Autowired
    private ContentService contentService;

    @RequestMapping("/index")
    public String showIndex(Model model) {
        String adJson = contentService.getContentList();
        model.addAttribute("ad1", adJson);

        return "index";
    }

    @RequestMapping(value="/httpclient/post", method=RequestMethod.POST,
            produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
    @ResponseBody
    public String testPost(String username, String password) {
        String result = "username:" + username + "\tpassword:" + password;
        System.out.println(result);
        return "username:" + username + ",password:" + password;
    }
}
