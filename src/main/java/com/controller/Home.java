package com.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
    
    private static final Logger logger = LogManager.getLogger(Home.class);

    /**
     * @Description:打开首页
     * @return
     * @author luodea 
     * @date 2018年4月19日
     */
    @RequestMapping("/")
    public String index() {
	logger.error("访问主页面");
	return "index";

    }


}
