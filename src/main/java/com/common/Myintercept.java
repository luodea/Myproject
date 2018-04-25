package com.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class Myintercept extends HandlerInterceptorAdapter{


    //ִ��Ŀ�귽��֮ǰִ�и÷���
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	    throws Exception {
	System.out.println("ִ��preHandle����������");
	if(request.getSession().getAttribute("uuid") != null) {
	    return true;
	}else {
	    request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
	    return false;
	}
    }


    //ִ��Ŀ�귽��֮����Ⱦmodelandview֮ǰִ�з�����
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
	    ModelAndView modelAndView) throws Exception {
	System.out.println("ִ��postHandle����������");
	super.postHandle(request, response, handler, modelAndView);
    }




    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
	    throws Exception {
	System.out.println("ִ��afterCompletion����������");
	super.afterCompletion(request, response, handler, ex);
    }




}
