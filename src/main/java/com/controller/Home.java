package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    /**
     * @Description:打开首页
     * @return
     * @author luodea 
     * @date 2018年4月19日
     */
    @RequestMapping("/")
    public String Home() {
	System.out.println("访问主页面");
	return "index";

    }


}
