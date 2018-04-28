package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.common.basedao.interf.BaseDao;
import com.entities.Person;

@Controller
public class Home {

    private static final Logger logger = LogManager.getLogger(Home.class);
	
    private final String USERNAME = "luodea";

    private final String PASSWORD = "123456";
    
    @Autowired
    private BaseDao<Person> dao;



    @RequestMapping("/")
    public ModelAndView index(HttpServletRequest request,HttpServletResponse response){
	ModelAndView model = new ModelAndView("index");

	model.addObject("username", "luodea");
	model.addObject("sex",1);

	List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
	Map<String, Object> m1 = new HashMap<String, Object>(); 
	Map<String, Object> m2 = new HashMap<String, Object>(); 
	Map<String, Object> m3 = new HashMap<String, Object>(); 
	m1.put("title", "java");
	m1.put("price",34);
	m1.put("unit", "元");

	m2.put("title", "php");
	m2.put("price",290);
	m2.put("unit", "元");

	m3.put("title", "ios");
	m3.put("price",99);
	m3.put("unit", "元");

	list.add(m1);
	list.add(m2);
	list.add(m3);
	model.addObject("list", list);

	return model;
    }

    @RequestMapping("/getJsonData")
    @ResponseBody
    public Person getJsonData() {
	return dao.findById(Person.class, 1);	
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request,HttpServletResponse response) {
	String username =  request.getParameter("username");
	String password =  request.getParameter("password");
	String nextpage = "login";
	logger.info("执行登录方法");
	if(username !=null && password!=null) {
	    if(!USERNAME.equals(username)||username.isEmpty()) {
		request.setAttribute("msg", "登录账号不存在");
	    }else if(!PASSWORD.equals(password)||password.isEmpty()) {
		request.setAttribute("msg", "登录密码不正确");
	    }else {	
		String uuid = UUID.randomUUID().toString();
		request.getSession().setAttribute("uuid", uuid);
		request.setAttribute("msg", "登录成功");
		logger.info("登录成功");
		nextpage = "redirect:/";
	    }
	}else {
	    request.setAttribute("msg", "请输入用户名和密码");
	}
	return nextpage;
    }


}
