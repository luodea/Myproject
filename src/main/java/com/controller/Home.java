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
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.common.repository.PersonService;
import com.entities.Person;

@Controller
public class Home {

	private static final Logger logger = LogManager.getLogger(Home.class);

	private final String USERNAME = "luodea";

	private final String PASSWORD = "123456";


	@Autowired
	private PersonService personService;



	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response){
		ModelAndView model = new ModelAndView("index");
		return model;
	}

	@RequestMapping("/personlist")
	public ModelAndView personlist(HttpServletRequest request,HttpServletResponse response){
		ModelAndView model = new ModelAndView("personlist");
		return model;
	}


	@RequestMapping("/form")
	public ModelAndView form(HttpServletRequest request,HttpServletResponse response){
		ModelAndView model = new ModelAndView("form");
		return model;
	}

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
		ModelAndView model = new ModelAndView("login");
		return model;
	}

	@RequestMapping("/getJsonData")
	@ResponseBody
	public Iterable<Person> getJsonData() {
		Pageable pageable = new PageRequest(1,10);
		return  personService.findAll(pageable);
	}




//	@RequestMapping("/login")
//	public String login(HttpServletRequest request,HttpServletResponse response) {
//		String username =  request.getParameter("username");
//		String password =  request.getParameter("password");
//		String nextpage = "login";
//		logger.info("执行登录方法");
//		if(username !=null && password!=null) {
//			if(!USERNAME.equals(username)||username.isEmpty()) {
//				request.setAttribute("msg", "登录账号不存在");
//			}else if(!PASSWORD.equals(password)||password.isEmpty()) {
//				request.setAttribute("msg", "登录密码不正确");
//			}else {	
//				String uuid = UUID.randomUUID().toString();
//				request.getSession().setAttribute("uuid", uuid);
//				request.setAttribute("msg", "登录成功");
//				logger.info("登录成功");
//				nextpage = "redirect:/";
//			}
//		}else {
//			request.setAttribute("msg", "请输入用户名和密码");
//		}
//		return nextpage;
//	}


}
