package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    /**
     * @Description:����ҳ
     * @return
     * @author luodea 
     * @date 2018��4��19��
     */
    @RequestMapping("/")
    public String Home() {
	System.out.println("������ҳ��");
	return "index";

    }


}
