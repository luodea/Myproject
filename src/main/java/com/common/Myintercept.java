package com.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class Myintercept extends HandlerInterceptorAdapter{


    //执行目标方法之前执行该方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	    throws Exception {
	System.out.println("执行preHandle。。。。。");
	if(request.getSession().getAttribute("uuid") != null) {
	    return true;
	}else {
	    request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
	    return false;
	}
    }


    //执行目标方法之后渲染modelandview之前执行方法发
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
	    ModelAndView modelAndView) throws Exception {
	System.out.println("执行postHandle。。。。。");
	super.postHandle(request, response, handler, modelAndView);
    }




    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
	    throws Exception {
	System.out.println("执行afterCompletion。。。。。");
	super.afterCompletion(request, response, handler, ex);
    }




}
