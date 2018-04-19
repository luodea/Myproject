package com.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
    
    private static final Logger logger = LogManager.getLogger(Home.class);

    /**
     * @Description:����ҳ
     * @return
     * @author luodea 
     * @date 2018��4��19��
     */
    @RequestMapping("/")
    public String index() {
	logger.error("������ҳ��");
	return "index";

    }


}
